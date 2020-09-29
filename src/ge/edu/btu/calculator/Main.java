package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args){
        CalculatorServiceImpl calc = new CalculatorServiceImpl();
        calc.divide(5,0);
        calc.divide(11.4, 2.0);
        calc.sum(1,2);
        calc.sum(1.2,2.1);
    }
}