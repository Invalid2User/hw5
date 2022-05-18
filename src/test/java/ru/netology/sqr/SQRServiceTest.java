package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    void sqrCalc(int rangeL, int rangeR, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCalc(rangeL, rangeR);
        Assertions.assertEquals(expected, actual);
    }
}