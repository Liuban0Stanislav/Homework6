import java.text.DecimalFormat;

public class IfExtra {
    public static void main(String[] args) {
        extraTask6();
        extraTask7();

    }

    private static void extraTask7() {
        System.out.println("Задание 7. Повышенная сложность.");

        var age = 25;
        var salary = 75_000;
        var wantedSum = 330_000;

        var bazovStavka = 0.1;
        var srokKreditov = 12; //мес
        var maxMonthPayment = 0.5 * salary; //рассчитываем максимальный месячный платеж
        String reshenie;

        //рассчитываем базовую ставку на основании условий задачи
        if (age < 23) {
            if (salary < 80_000) {
                bazovStavka = bazovStavka - 0.007;
            }
            bazovStavka = bazovStavka + 0.01;
        } else if (age >=23 && age < 30) {
            if (salary < 80_000) {
                bazovStavka = bazovStavka - 0.007;
            }
            bazovStavka = bazovStavka + 0.005;
        }

        //рассчитываем фактический месячный платеж
        var wantedMonthPayment = wantedSum / srokKreditov * bazovStavka;

        //Сравниваем максимальный платеж с фактическим и делаем вывод - одобрено/отказано
        if (maxMonthPayment > wantedMonthPayment) {
            reshenie = "Одобрено!";
        } else {
            reshenie = "Отказано!";
        }

        System.out.println("Максимальный платеж при ЗП " + new DecimalFormat("###,###.####").format(salary) +
                " равен " + new DecimalFormat("###,###.####").format(maxMonthPayment) +
                " рублей. Платеж по кредиту " + new DecimalFormat("###,###.####").format( wantedMonthPayment) +
                " рублей. " + reshenie);
    }

    public static void extraTask6() {
        System.out.println("Задание 6. Повышенная сложность.");

        int age = 19;
        int salary = 30_000;
        int limit = 0;

        if (salary > 50_000) {

            if (age < 23) {
                if (salary >= 50_000) {
                    limit = (int) (salary * 2 * 1.2);
                }
                if (salary >= 80_000) {
                    limit = (int) (salary * 2 * 1.5);
                }
            }

            if (age >= 23) {
                if (salary >= 50_000) {
                    limit = (int) (salary * 3 * 1.2);
                }
                if (salary >= 80_000) {
                    limit = (int) (salary * 3 * 1.5);
                }
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");

        } else {
            System.out.println("Кредитную карту выдать невозможно");
        }
    }
}
