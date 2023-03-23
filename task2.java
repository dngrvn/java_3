package job;

// 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Создание рандомной коллекции
        class_job.RandomCollection(list);
        // Удаление из коллекции чётных чисел
        class_job.delEvenNumbers(list);

    }
}