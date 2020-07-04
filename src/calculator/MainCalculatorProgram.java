package calculator;

import calculator.CalculatorMethods;

class MainCalculatorProgram {
    public static void main(String[] args) {
        int result;
        CalculatorMethods c = new CalculatorMethods();    //object created for calculatormethods page
        result = c.Div(563647, 20);            //calling the required method as we wish from calculator methods
        System.out.println(result);
    }
}





