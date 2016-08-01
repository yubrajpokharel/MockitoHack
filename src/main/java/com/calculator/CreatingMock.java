package com.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by yubraj on 8/1/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class CreatingMock {

    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp(){
        calculatorService = mock(CalculatorService.class);
        mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void add_Two_Float_Test(){
        when(calculatorService.add(10.00, 20.00)).thenReturn(30.00);
        assertEquals(30.00, calculatorService.add(10.00, 20.00), 0);
        assertEquals(30.00, calculatorService.add(10.00, 20.00), 0);
        verify(calculatorService, atLeast(2)).add(10.00, 20.00);
    }

}
