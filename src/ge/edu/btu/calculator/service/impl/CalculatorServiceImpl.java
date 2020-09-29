package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public void sum(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void sum(double x, double y) {
        System.out.println(x+y);
    }

    @Override
    public void divide(int x, int y) {
        try {
            System.out.println(x / y);
        }
        catch (ArithmeticException exception){
            System.out.println("Nulze gayofa");
        }
    }

    @Override
    public void divide(double x, double y) {
        try {
            System.out.println(x / y);
        }
        catch (ArithmeticException exception){
            System.out.println("Nulze gayofa");
        }
    }
}
