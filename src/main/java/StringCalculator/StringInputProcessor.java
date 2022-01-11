package StringCalculator;

import java.util.LinkedList;

public class StringInputProcessor {

    public LinkedList<Object> pick(String input, String target){
        LinkedList<Object> list = new LinkedList<>();

        String[] inputStr = input.split(" ");
        for(int i=0; i< inputStr.length; i++){

            if(target.equals("operand") && i%2==0){
                list.add(Integer.parseInt(inputStr[i]));
            }
            else if(target.equals("operator") && i%2==1){
                list.add(inputStr[i]);
            }
        }

        return list;
    }

}
