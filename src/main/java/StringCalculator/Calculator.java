package StringCalculator;


import java.util.LinkedList;

public class Calculator {

    private int add(int num1, int num2){
        return num1 + num2;
    }

    private int sub(int num1, int num2){
        return num1 - num2;
    }

    private int mul(int num1, int num2){
        return num1 * num2;
    }

    private int div(int num1, int num2){
        return num1 / num2;
    }

    private int calculation(int first, int second, String operator){
        int value = 0;

        switch (operator){
            case "+" :
                value = add(first, second);
                break;
            case "-" :
                value = sub(first, second);
                break;
            case "*" :
                value = mul(first, second);
                break;
            case "/" :
                value = div(first, second);
                break;
        }

        return value;
    }

    public int getAnswer(LinkedList<Object> operand, LinkedList<Object> operator){
        if(operand.isEmpty() || operator.isEmpty() || operand.size() == operator.size()){
            System.out.println("계산식이 잘못되었습니다.");
            return 0;
        }

        while(!operator.isEmpty()){
            int first = (Integer)operand.remove();
            int second = (Integer)operand.remove();
            String oper = (String)operator.remove();

            operand.addFirst(calculation(first, second, oper));
        }

        return (Integer)operand.remove();
    }


}
