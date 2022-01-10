package StringCalculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringInputProcessor {

    public Queue<Integer> operandPick(String input){
        Queue<Integer> q = new LinkedList<>();

        String[] inputStr = input.split(" ");
        for(int i=0; i< inputStr.length; i++){
            if(i%2==0)
                q.offer(Integer.parseInt(inputStr[i]));
        }

        return q;
    }

}
