package job;

// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Создание рандомной коллекции
        class_job.RandomCollection(list);
        // среднеарифметическое коллекции
        class_job.midArithmetic(list);
        // Минимальное и максимальное чиса коллекции
        class_job.MinMax(list);
    }
}