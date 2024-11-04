package Strategy;

public class Type1Strategy implements LearningStrategy {
    @Override
    public double calculateTime(double baseTime, double talent) {
        return baseTime / talent;
    }
}

