public class Main {
    public static void main(String[] args) {
        // Домашнее задание
        // Задание 1
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
    }
}