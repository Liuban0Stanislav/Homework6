import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task3var2();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task10() {
        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
              int rez = i * j;
                System.out.println(i + " x " + j + " = " + rez);
            }
        }
    }

    private static void task9() {
        System.out.println("Задача 9");

        int nakopleniya = 29_000;
        int total = 0;
        double monthPercent = 12 / 100 / 12;

        for (int i = 1; i <= 12; i++) {
            total = (int) (total + total * monthPercent);
            total = total + nakopleniya;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    new DecimalFormat("###,###.##").format(total) + " рублей");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");

        int nakopleniya = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + nakopleniya;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    new DecimalFormat("###,###.##").format(total) + " рублей");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");

        for (int i = 0; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Число: " + i);
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3 вар1");

        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное число - " + i);
            }
        }
        System.out.println();
    }

    private static void task3var2() {
        System.out.println("Задача 3 вар2");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четное число - " + i);
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