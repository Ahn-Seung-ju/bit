package Day0120;
//숙제2 : 사용자로부터 점수를 입력받아 A, B, C, D,F를 출력하는 프로그램을
//       작성하세요. 단 잘못된 점수가 입력되면 올바른 점수가 입력될때까지
//       다시 입력을 받으세요
import java.util.Scanner;
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수: ");
        int score = scanner.nextInt();
        
        while(score > 100 || score < 0) {
            System.out.println("점수를 잘못입력하셨습니다.");
            System.out.print("점수: ");
            score = scanner.nextInt();
        }
        if(score > 90) {
            System.out.println("Grade: A");            
        }else if(score > 80) {
            System.out.println("Grade: B");
        }else if(score > 70) {
            System.out.println("Grade: C");
        }else if(score > 60) {
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");            
        }
        
        scanner.close();
    }
    

}
