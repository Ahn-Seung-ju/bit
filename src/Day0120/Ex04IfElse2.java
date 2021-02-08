package Day0120;

import java.util.Scanner;

public class Ex04IfElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 1) {
            System.out.println( "홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
       
        System.out.print("나이를 입력하세요: ");      
        int age = scanner.nextInt();
        
        if (age >= 19) {
            System.out.println("성인입니다");
            
        }else {
            System.out.println("미성년자입니다.");
        }
        
        System.out.print("아이디를 입력하세요: ");
        scanner.nextLine();
        String id = scanner.nextLine();
        
        System.out.print("비밀번호를 입력하세요: ");
        String pw = scanner.nextLine();
        
        if( id.equals("admin") && pw.equals("12345")) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");           
        }
        
        System.out.println("시스템 종료");
        

        
        scanner.close();

    }

}
