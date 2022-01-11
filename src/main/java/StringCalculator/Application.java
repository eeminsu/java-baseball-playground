package StringCalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        StringInputProcessor sp = new StringInputProcessor();
        Calculator cal = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("계산식을 입력하세요 : ");
        String problem = scan.nextLine();

        int answer = cal.getAnswer(sp.pick(problem,"operand"),
                sp.pick(problem,"operator"));

        System.out.println(answer);
    }
}
