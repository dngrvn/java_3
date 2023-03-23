package job;

//4*. (Необязательная задача повышенной сложности)
// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, 
// А ТАКЖЕ числа из второй, которых нет в первой
import java.util.ArrayList;

public class task4 {

    public static void main(String[] args) {
 
        ArrayList<Integer> massiv_1 = new ArrayList<>();
        ArrayList<Integer> massiv_2 = new ArrayList<>();

        // Создание рандомных коллекций
        class_job.RandomCollection(massiv_1);
        class_job.RandomCollection(massiv_2);

        // Разница элементов коллекций
        // class_job.differenceElement(massiv_1, massiv_2);

        // Разница коллекций 1 - 2
        //class_job.difference(massiv_1, massiv_2);

        // Разница коллекций 2 - 1
        //class_job.difference(massiv_2, massiv_1);
        
        // Симметричная разницф коллекций
        //class_job.differenceSymmetry(massiv_1, massiv_2);

    }

}
