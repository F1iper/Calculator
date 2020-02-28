package pl.kodilla.calculator;

public class Calculator {

    public int addAToB (int a, int b){
        return a + b;
    }
    public int subtractAFromB(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.addAToB(2,6));
        System.out.println(calculator.subtractAFromB(7,12));
    }
}
