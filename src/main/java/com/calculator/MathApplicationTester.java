package com.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
        //add the behavior of calc service to add two numbers
        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);

        //add the behavior of calc service to subtract two numbers
        when(calculatorService.sub(20.0,10.0)).thenReturn(10.00);

        //test the add functionality
        assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
        assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
        assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

        //test the subtract functionality
        assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0.0);

        //default call count is 1
        verify(calculatorService).sub(20.0, 10.0);

        //check if add function is called three times
        verify(calculatorService, times(3)).add(10.0, 20.0);

        //verify that method was never called on a mock
        verify(calculatorService, never()).mul(10.0,20.0);
    }

}
