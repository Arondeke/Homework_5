public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2016;

        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023;
        int conditionOneHudred = year % 100;
        int conditionFourHundred = year % 400;
        int conditionFour = year % 4;

        if ((conditionFour == 0) || (conditionFourHundred == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("//Одно условие в программе лишнее. Только путает//");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte deliveryDistance = 101;
        byte limitArea20 = 20;
        byte limitArea60 = 60;
        byte limitArea100 = 100;
        int diliveryDays = 1;

        if (deliveryDistance <= limitArea20) {
            diliveryDays = 1;
            System.out.println("Потребуется дней:" + diliveryDays);
        } else if ((deliveryDistance > limitArea20) && (deliveryDistance <= limitArea60)) {
            diliveryDays = diliveryDays + 1;
            System.out.println("Потребуется дней:" + diliveryDays);
        } else if ((deliveryDistance > limitArea60) && (deliveryDistance <= limitArea100)) {
            diliveryDays = diliveryDays + 2;
            System.out.println("Потребуется дней:" + diliveryDays);
        } else if (deliveryDistance > limitArea100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 10;

        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}