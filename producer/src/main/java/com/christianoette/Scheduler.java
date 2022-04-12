package com.christianoette;

import com.christianoette.interfaces.MathLib;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Scheduler {

    private final MathLib mathLibrary;

    public Scheduler(MathLib mathLibrary) {
        this.mathLibrary = mathLibrary;
    }

    @Scheduled(fixedRate = 5000, initialDelay = 1000)
    public void scheduleCalculation() {
        BigDecimal valueOne = createRandomInput();
        BigDecimal valueTwo = createRandomInput();
        BigDecimal result = mathLibrary.calculateSum(valueOne, valueTwo);

        System.out.printf("Calculated summary %s + %s = %s \n", valueOne, valueTwo, result);
    }

    private BigDecimal createRandomInput() {
        int value = (int) (Math.random() * 100);
        return new BigDecimal(value);
    }
}
