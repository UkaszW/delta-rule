import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TrainingPattern {

    private List<Double> inputs;
    private Double expectedValues;

}
