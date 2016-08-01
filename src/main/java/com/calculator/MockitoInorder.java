package com.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by yubraj on 8/1/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class MockitoInorder {
    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calculatorService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void add_Test_With_Order_privillage(){
        when(calculatorService.add(10.00, 20.00)).thenReturn(30.00);
        when(calculatorService.sub(20.00, 10.00)).thenReturn(10.00);

        assertEquals(30.00, calculatorService.add(10.00, 20.00), 0.00);
        assertEquals(10.00, calculatorService.sub(20.00, 10.00), 0.00);

        InOrder inOrder = inOrder(calculatorService);
        inOrder.verify(calculatorService).add(10.00, 20.00);
        inOrder.verify(calculatorService).sub(20.00, 10.00);
    }

}
