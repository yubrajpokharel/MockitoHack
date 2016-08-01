package com.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by yubraj on 8/1/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    @InjectMocks
    MathApplication mathApplication;

    @Mock
    CalculatorService calculatorService;

    @Test
    public void addTest(){
        when(calculatorService.add(10.00, 20.00)).thenReturn(30.00);
        assertEquals(30.00, calculatorService.add(10.00, 20.00), 0);
    }

}
