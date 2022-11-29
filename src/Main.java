public class Main {
    public static void main(String[] args) {
        // Домашнее задание
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не удалось распознать вашу операционную систему");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        switch (clientOS){
            case 0:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Не удалось распознать вашу операционную систему");
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryStep = 40;
        int deliveryTime = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            deliveryDistance -= 20;
            if (deliveryDistance / deliveryStep == 0){
                deliveryTime += 1;
                System.out.println("Потребуется дней: " + deliveryTime);
            } else {
                deliveryTime += deliveryDistance / deliveryStep + 1;
                System.out.println("Потребуется дней: " + deliveryTime);
            }
        }

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
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
            default:
                System.out.println("Некорректный ввод");
        }
    }
}
