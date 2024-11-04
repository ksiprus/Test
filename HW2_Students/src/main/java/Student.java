import Strategy.LearningStrategy;

public class Student {
    private LearningStrategy strategy;
    private double talent;

    public Student(LearningStrategy strategy, double talent) {
        this.strategy = strategy;
        this.talent = talent;
    }

    public double getTimeToLearn(double baseTime) {
        return strategy.calculateTime(baseTime, talent);
    }

    public double getTalent() {
        return talent;
    }
}

