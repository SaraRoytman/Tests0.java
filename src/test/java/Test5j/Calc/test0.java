package Test5j.Calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test0 {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int res = calculator.add(10,5);
        assertEquals(15, res);

    }
    @Test
    public void factorialTest(){
        Calculator calculator = new Calculator();
        int res = calculator.factorial(4);
        assertEquals(24,res);


    }



}
