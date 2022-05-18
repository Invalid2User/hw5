package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.sqrCalc(100, 10000);

        System.out.println(result);

    }
}
