import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task0() {
        int[] weights = new int[]{
                90, 91, 92, 93, 94, 85, 81, 34, 39, 0, 0, 0
        };
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }


    }

    /**
     * Задача 1
     * Объявите три массива:
     * Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
     * Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
     * Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
     * с помощью ключевого слова или сразу заполненный элементами.
     */
    public static void task1() {
        System.out.println("Task 1, объявил массивы");
        int[] whole = new int[]{1, 2, 3};
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        double[] fractional = new double[]{1, 57, 7, 654, 9, 986};
        float[] taxi = new float[12];


    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
     */
    public static void task2() {
        System.out.println("Task 2");
        int[] whole = new int[]{1, 2, 3};
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        double[] fractional = new double[]{1, 57, 7, 654, 9, 986};
        float[] taxi = new float[12];
        for (int i = 0; i < whole.length; i++) {
            if (i == whole.length - 1) {
                System.out.println(whole[i]);
                break;
            }
            System.out.print(whole[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.println(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + " ,");
        }
        System.out.println();
        for (int i = 0; i < taxi.length; i++) {
            if (i == taxi.length - 1) {
                System.out.println(taxi[i]);
                break;
            }
            System.out.print(taxi[i] + " ,");
        }
        System.out.println();
    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
     * Если в задаче № 2 в консоль у вас вывелся результат:
     * 1, 2, 3
     * 1.57, 7.654, 9.986
     * // произвольные элементы третьего массива
     * то в этой задаче результат должен быть таким:
     * 3, 2, 1
     * 9.986, 7.654, 1.57
     * // произвольные элементы третьего массива в обратном порядке
     */
    public static void task3() {
        System.out.println("Task 3");
        int[] whole = new int[]{1, 2, 3};
        double[] fractional = new double[]{1, 57, 7, 654, 9, 986};
        float[] taxi = new float[12];
        for (int i = 2; i >= 0; i--) {
            if (i <= 0) {
                System.out.println(whole[i]);
                break;
            }
            System.out.print(whole[i] + " , ");
        }
        System.out.println();
        for (int i = 5; i >= 0; i--) {
            if (i <= 0) {
                System.out.println(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + " ,");
        }
        System.out.println();
        for (int i = 11; i >= 0; i--) {
            if (i <= 0) {
                System.out.println(taxi[i]);
                break;
            }
            System.out.print(taxi[i] + " ,");
        }
        System.out.println();
    }

    /**
     * Задача 4
     * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
     * <p>
     * Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
     * <p>
     * Распечатайте результат преобразования в консоль.
     */
    public static void task4() {
        System.out.println("Task 4");
        int[] whole = {1, 2, 3};
        for (int i = 0; i < whole.length; i++) {
            if (whole[i] % 2 != 0) {
                whole[i] += 1;
            }
        }
        System.out.println(Arrays.toString(whole));
    }

}