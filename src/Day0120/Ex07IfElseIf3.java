package Day0120;

import java.util.Scanner;
public class Ex07IfElseIf3 {
    public static void mian (String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        if(age <=5 ) {
            System.out.println("영아입니다.");
        }else if(age <= 13) {
            System.out.println("어린이입니다.");
        }else if(age <= 18 ) {
            System.out.println("청소년입니다");
        }else  {
            System.out.println("성인입니다.");
        }
        
        
        scanner.close();
        

    }
    

}
