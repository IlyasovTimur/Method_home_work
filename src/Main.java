import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void deliveryTime(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }

    private static void task3() {
        System.out.println("Task 3/ доставка карт");
        int deliveryDistance = 25;
        deliveryTime(deliveryDistance);
    }

    private static void choosingVersion (int device, boolean release) {
        if (device == 0) {
            if (release) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для iOS по ссылке».");
            }
        }
        if (device != 0) {
            if (!release) {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            }
        }
    }

    private static int calculatingTheYear () {
        Random random = new Random();
        int min = 2007;
        int max = 2022;
        int diff = max - min;
        int year = random.nextInt(diff + 1) + min;
        return year;
    }

    private static void task2() {
        System.out.println("Task 2/ версия приложения");
        int yearOfRelease = calculatingTheYear();
        int deviceType = ThreadLocalRandom.current().nextInt(2);
        boolean releasedBefore2015 = yearOfRelease < 2015;
        choosingVersion(deviceType,releasedBefore2015);
    }

    private static void checkYear (int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.printf("%d год является високосным\n", x);
        } else {
            System.out.printf("%d год не является високосным\n", x);
        }
    }
    private static void task1() {
        System.out.println("Task 1/ високосный год");
        int year = 2020;
       checkYear(year);
    }
}