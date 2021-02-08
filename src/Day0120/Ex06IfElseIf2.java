package Day0120;
// 1. 사용자로부터 숫자를 입력받아서
//    해당 숫자가 한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지
//    보여주는 프로그램
// 2. 사용자로부터 나이를 입력받아서
//    ~5: 영아
//    ~13: 어린이
//    ~18: 청소년
//    19~: 성인
//    이 출력되는 프로그램
// 3. 사용자로부터 점수를 입력 받아서
//    90점이상: A
//    80점대: B
//    70점대: C
//    60점대: D
//    그외: f
//    가 출력되는 프로그램
import java.util.Scanner;
public class Ex06IfElseIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        
        if(number < 10) {
            System.out.println("1자리 숫자입니다.");            
        }else if(number< 100) {
            System.out.println("2자리 숫자입니다.");
        }else if(number<1000) {
            System.out.println("3자리 숫자입니다.");
        }else {
            System.out.println("4자리 이상 숫자입니다.");            
        }
        
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        
        if(age >= 19) {
            System.out.println("성인입니다.");
        }else if(age > 13) {
            System.out.println("청소년입니다.");
        }else if(age > 5 ) {
            System.out.println("어린이입니다");
        }else if(age >= 0) {
            System.out.println("유아입니다.");
        }
        
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        
        if(score >= 90) {
            System.out.println("Grade: A");
        }else if(score >= 80) {
            System.out.println("Grade: B");         
        }else if(score >= 70) {
            System.out.println("Grade: C");
        }else if(score >= 60) {
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }

        
        
        scanner.close();
    }

}
