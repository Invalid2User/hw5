package ru.netology.sqr;

public class SQRService {
    public int sqrCalc(int rangeL, int rangeR) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr > rangeL) {
                if (sqr < rangeR) {
                    count++;
                }
            }
        }
        return count;
    }
}
