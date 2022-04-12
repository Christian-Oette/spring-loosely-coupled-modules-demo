package com.christianoette.consumer;

import com.christianoette.interfaces.MathLib;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MathService implements MathLib {

    public BigDecimal calculateSum(BigDecimal one, BigDecimal two) {
        return one.add(two);
    }
}
