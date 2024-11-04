package Strategy;

public class Type3Strategy implements LearningStrategy {
    @Override
    public double calculateTime(double baseTime, double talent) {
        return 3 * baseTime / talent;
    }
}
