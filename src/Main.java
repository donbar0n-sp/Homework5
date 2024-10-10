@SuppressWarnings({"DataFlowIssue", "ConstantValue"})
public class Main {
    public static void main(String[] args) {

        //task1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Device not found, please enter correct operating system");
        }

        //task2
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        boolean newDevice = clientDeviceYear >= 2015;
        if (!newDevice && clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (newDevice && clientOS2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (!newDevice && clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (newDevice && clientOS2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Device not found, please enter correct operating system");
        }

        //task3
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //task4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("delivery not possible");
        }

        //task5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("there is no such month");
        }
    }
}