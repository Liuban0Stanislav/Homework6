public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Число: " + i);
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное число - " + i);
            }
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Число - " + i);
        }
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Число - " + i);
        }
        System.out.println();
    }

}