import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Data
public class Neuron {

    private Integer numberOfInputs;
    private List<Double> weights;

    public Neuron(Integer numberOfInputs, Double left, Double right) {
        this.numberOfInputs = numberOfInputs;
        this.weights = prepareWeightsFromInterval(numberOfInputs, left, right);
    }

    public void teach(TrainingPattern pattern, Integer epochs, Double step) {
        teach(Collections.singletonList(pattern), epochs, step);
    }

    public void teach(List<TrainingPattern> patterns, Integer epochs, Double step) {
        for (int i = 0; i < epochs; i++) {
            for (TrainingPattern pattern : patterns) {
                double y = calculateOutput(pattern.getInputs());
                for (int j = 0; j < getNumberOfInputs(); j++) {
                    double newWeight =
                            getWeights().get(j) + step * (pattern.getExpectedValues() - y) * pattern.getInputs().get(j);
                    getWeights().set(j, newWeight);
                }
            }
        }
    }

    private List<Double> prepareWeightsFromInterval(Integer numberOfInputs, Double left, Double right) {
        List<Double> weights = new ArrayList<>();
        Random random = new Random();

        if (left > right) {
            left = right;
        }

        for (int i = 0; i < numberOfInputs; i++) {
            weights.add(random.nextDouble() * (right - left) + left);
        }

        return weights;
    }

    private Double calculateOutput(List<Double> inputs) {
        if (inputs.size() != getWeights().size()) {
            throw new IllegalArgumentException("The number of inputs and weights does not match!");
        }

        double output = 0.;

        for (int i = 0; i < getNumberOfInputs(); i++) {
            output += inputs.get(i) * getWeights().get(i);
        }

        return output;
    }
}
