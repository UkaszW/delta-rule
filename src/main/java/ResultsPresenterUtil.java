import java.util.ArrayList;
import java.util.List;

public class ResultsPresenterUtil {

    public static void single() {
        System.out.println(":::::::::::::::::Single:::::::::::::::::::");
        System.out.println("::::Test 1::::");
        List<Double> inputs1 = new ArrayList<>();
        inputs1.add(3.43776);
        inputs1.add(4.51051);
        double expectedOutput1 = 0.71427;
        TrainingPattern pattern1 = new TrainingPattern(inputs1, expectedOutput1);
        Neuron neuron1 = new Neuron(pattern1.getInputs().size(), 0., 1.);
        neuron1.teach(pattern1, 50, 0.01);
        System.out.println(pattern1.toString());
        System.out.println(neuron1.toString());

        System.out.println("::::Test 2::::");
        List<Double> inputs2 = new ArrayList<>();
        inputs2.add(-7.40160);
        inputs2.add(4.66901);
        double expectedOutput2 = -0.12471;
        TrainingPattern pattern2 = new TrainingPattern(inputs2, expectedOutput2);
        Neuron neuron2 = new Neuron(pattern2.getInputs().size(), 0., 3.);
        neuron2.teach(pattern2, 50, 0.01);
        System.out.println(pattern2.toString());
        System.out.println(neuron2.toString());

        System.out.println("::::Test 3::::");
        List<Double> inputs3 = new ArrayList<>();
        inputs3.add(5.03800);
        inputs3.add(-9.59690);
        inputs3.add(5.60993);
        inputs3.add(-1.18243);
        inputs3.add(-0.95779);
        inputs3.add(-7.46030);
        inputs3.add(-8.23987);
        inputs3.add(-6.96355);
        inputs3.add(6.05941);
        inputs3.add(1.17025);
        double expectedOutput3 = 111.31914;
        TrainingPattern pattern3 = new TrainingPattern(inputs3, expectedOutput3);
        Neuron neuron3 = new Neuron(pattern3.getInputs().size(), 0., 3.);
        neuron3.teach(pattern3, 100, 0.001);
        System.out.println(pattern3.toString());
        System.out.println(neuron3.toString());
    }

    public static void multiple() {
        System.out.println(":::::::::::::::::Multiple:::::::::::::::::::");
        System.out.println("::::Test 1::::");
        List<Double> inputs11 = new ArrayList<>();
        inputs11.add(3.43776);
        inputs11.add(4.51051);
        double expectedOutput11 = 0.71427;
        List<TrainingPattern> trainingPatterns1 = new ArrayList<>();
        TrainingPattern pattern11 = new TrainingPattern(inputs11, expectedOutput11);
        List<Double> inputs12 = new ArrayList<>();
        inputs12.add(-7.40160);
        inputs12.add(4.66901);
        double expectedOutput12 = -0.12471;
        TrainingPattern pattern12 = new TrainingPattern(inputs12, expectedOutput12);
        trainingPatterns1.add(pattern11);
        trainingPatterns1.add(pattern12);
        Neuron neuron1 = new Neuron(pattern11.getInputs().size(), 0., 1.);
        neuron1.teach(trainingPatterns1, 100, 0.01);
        System.out.println(pattern11.toString());
        System.out.println(pattern12.toString());
        System.out.println(neuron1.toString());

        System.out.println("::::Test 2::::");
        List<Double> inputs21 = new ArrayList<>();
        inputs21.add(5.03800);
        inputs21.add(-9.59690);
        inputs21.add(5.60993);
        inputs21.add(-1.18243);
        inputs21.add(-0.95779);
        inputs21.add(-7.46030);
        inputs21.add(-8.23987);
        inputs21.add(-6.96355);
        inputs21.add(6.05941);
        inputs21.add(1.17025);
        double expectedOutput21 = 111.31914;
        List<TrainingPattern> trainingPatterns2 = new ArrayList<>();
        TrainingPattern pattern21 = new TrainingPattern(inputs21, expectedOutput21);
        List<Double> inputs22 = new ArrayList<>();
        inputs22.add(2.22802);
        inputs22.add(1.90442);
        inputs22.add(-8.88582);
        inputs22.add(-6.29559);
        inputs22.add(6.71617);
        inputs22.add(1.28940);
        inputs22.add(-9.24163);
        inputs22.add(0.75831);
        inputs22.add(-7.83095);
        inputs22.add(-0.66526);
        double expectedOutput22 = 362.62635;
        TrainingPattern pattern22 = new TrainingPattern(inputs22, expectedOutput22);

        List<Double> inputs23 = new ArrayList<>();
        inputs23.add(0.59632);
        inputs23.add(-6.73714);
        inputs23.add(3.24675);
        inputs23.add(-0.83827);
        inputs23.add(2.42437);
        inputs23.add(6.38592);
        inputs23.add(-5.02738);
        inputs23.add(-9.90179);
        inputs23.add(-7.58034);
        inputs23.add(4.89660);
        double expectedOutput23 = 616.60069;
        TrainingPattern pattern23 = new TrainingPattern(inputs23, expectedOutput23);

        trainingPatterns2.add(pattern21);
        trainingPatterns2.add(pattern22);
        trainingPatterns2.add(pattern23);
        Neuron neuron2 = new Neuron(pattern21.getInputs().size(), 0., 1.);
        neuron2.teach(trainingPatterns2, 120, 0.001);
        System.out.println(pattern21.toString());
        System.out.println(pattern22.toString());
        System.out.println(neuron2.toString());
    }
}
