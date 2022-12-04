package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcSquareIfCorrectMinMax() {
        SQRService service = new SQRService();
        int expected = 3;
        int min = 200;
        int max = 300;
        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSquareIfNegativeMin() {
        SQRService service = new SQRService();
        int expected = 8;
        int min = -200;
        int max = 300;
        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSquareIfNegativeMinMax() {
        SQRService service = new SQRService();
        int expected = 0;
        int min = -100;
        int max = -300;
        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSquareIfBoundaryMinMax() {
        SQRService service = new SQRService();
        int expected = 90;
        int min = 100;
        int max = 10000;
        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
