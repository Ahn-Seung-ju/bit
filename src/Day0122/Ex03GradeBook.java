package Day0122;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
// 출력
//단, 사용자가 메뉴에서 1이라고 입력할 때마다 새로운 정보를 입력할수 있어야 한다
//또한 사용자가 메뉴에서 2라고 입력할 때 마다 입력된 정보를 출력할 수 있어야한다.
// 만약 사용자가 메뉴에서 3이라고 입력하면 프로그램은 종료한다.
import java.util.Scanner;
public class Ex03GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("1. 점수 입력 2. 점수 출력 3. 종료: ");
            int userChoice = scanner.nextInt();
            
 
            
            if( userChoice == 1) {
                
                
                System.out.print("국어: ");
               // korean = scanner.nextInt();
                
                
                System.out.print("영어: ");
              //  english = scanner.nextInt();
                
                
                System.out.print("수학: ");
               // math = scanner.nextInt();
                
                System.out.println("입력완료");
                
                
            }else if( userChoice == 2) {
                
               // System.out.printf("국어: %d점 \t 영어: %d점\t 수학%d점\n", korean, english, math);
                
                
            }else if( userChoice == 3) {
                
                System.out.println("종료");
                break;
                
            }else {
                System.out.println(" 잘못 입력하셨습니다.");
            }
            
        }
        
        
        
        scanner.close();
    }

}
