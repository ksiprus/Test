package Strategy;

public class Type2Strategy implements LearningStrategy {
    @Override
    public double calculateTime(double baseTime, double talent) {
        return 2 * baseTime / talent;
    }
}
