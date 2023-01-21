public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int ageM = 15;
        if (ageM >= 2 && ageM <= 6) {
            System.out.println("Если возраст человека равен " + ageM + ", то ему нужно ходить в детский сад");
        }
        if (ageM > 6 && ageM <= 18) {
            System.out.println("Если возраст человека равен " + ageM + ", то ему нужно ходить в школу");
        }
        if (ageM > 18 && ageM <= 24) {
            System.out.println("Если возраст человека равен " + ageM + ", то ему нужно ходить в универ");
        }
        if (ageM > 24) {
            System.out.println("Если возраст человека равен " + ageM + ", то ему нужно ходить на работу");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 1;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }

    }
    public static void task6() {
        System.out.println("Задача 6");
        int carCapacity = 102;
        int sittingPlaces = 60;
        int people = 91;
        if (people > carCapacity) {
            System.out.println("В вагоне нет мест");
        } else {
            if (people > sittingPlaces && people <= carCapacity) {
                System.out.println("В вагоне остались только стоячие места");
            } else {
                System.out.println("В вагоне остались сидячие места");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 22;
        int three = 22;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " является самым большим");
        }
        if (two >= one && two >= three) {
            System.out.println("Число " + two + " является самым большим");
        }
        if (three >= one && three >= two) {
            System.out.println("Число " + three + " является самым большим");
        }

    }


}
