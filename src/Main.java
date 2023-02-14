import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = {2342, 345, 378, 5438};
    }

    public static void task2() {
        System.out.println("\nЗадание 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = {2342, 345, 378, 5438};

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[array2.length - 1]);

        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[array3.length - 1]);
    }

    public static void task3() {
        System.out.println("\nЗадание 3");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = {2342, 345, 378, 5438};

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);

        for (int i = array2.length - 1; i > 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[0]);

        for (int i = array3.length - 1; i > 0; i--) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[0]);
    }

    public static void task4() {
        System.out.println("\nЗадание 4");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}