import java.util.Arrays;

public class TaskOne {

//    Сформировать и заполнить массив случайным числами
//    и вывести максимальное, минимальное и среднее значение.
//    Для генерации случайного числа использовать метод Math.random(),
//    который возвращает значение в промежутке [0, 1].

    public static void main(String[] args) {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double avg = Arrays.stream(array).sum() / array.length;
        Arrays.sort(array);

        System.out.println("Min value: " + array[0]);
        System.out.println("Avg value: " + avg);
        System.out.println("Max value: " + array[array.length - 1]);
    }
}
