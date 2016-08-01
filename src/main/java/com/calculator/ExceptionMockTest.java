package com.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

/**
 * Created by yubraj on 8/1/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class ExceptionMockTest {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test(expected = IllegalArgumentException.class)
    public void addTest_With_IlligalArgumentException(){
        doThrow(new IllegalArgumentException("Illigal Argument"))
                .when(calculatorService).add(10.00, 20.00);
        assertEquals(30.00, calculatorService.add(10.00, 20.00), 0);
    }

    @Test(expected = RuntimeException.class)
    public void addTest_With_RuntimeException(){
        doThrow(new RuntimeException("error"))
                .when(calculatorService).add(10.00, 20.00);
        assertEquals(30.00, calculatorService.add(10.00,20.00), 0);
    }


}
