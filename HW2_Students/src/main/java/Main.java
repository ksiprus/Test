
import Strategy.LearningStrategy;
import Strategy.Type1Strategy;
import Strategy.Type2Strategy;
import Strategy.Type3Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double baseTime = 198.0; // Общее время на освоение навыка
        Random random = new Random();

        String[] names = {"Алексей", "Мария", "Иван", "Екатерина", "Дмитрий", "Ольга", "Сергей", "Анна", "Максим", "Юлия"};

        LearningStrategy[] strategies = {
                new Type1Strategy(),
                new Type2Strategy(),
                new Type3Strategy()
        };

        for (int type = 0; type < 3; type++) {
            for (int i = 0; i < 3; i++) {
                double talent = 0.1 + (1.0 - 0.1) * random.nextDouble();
                Student student = new Student(strategies[type], talent);
                double time = student.getTimeToLearn(baseTime);

                // Выбираем случайное имя из массива
                String name = names[random.nextInt(names.length)];

                // Формируем строку результата
                String result = "Имя: " + name +
                        ", Тип: " + (type + 1) +
                        ", Талант: " + String.format("%.2f", student.getTalent()) +
                        ", Время на изучение: " + String.format("%.2f", time) + " часов";

                // Выводим результат с использованием println
                System.out.println(result);
            }
        }
    }
}
