package Day0120;
// 사용자로부터
// 국어 영어 수학 점수를 입력받아서
// 모든 점수가 60점 이상이고
// 평균이 70점 이상이면 합격
// 그 외에는 불합격이 뜨는 프로그램을 작성하시오
import java.util.Scanner;
public class Ex11GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어점수: ");
        int korean = scanner.nextInt();
        
        System.out.print("영어점수: ");
        int english = scanner.nextInt();
        
        System.out.print("수학점수: ");
        int math = scanner.nextInt();
        
        int sum  = korean + english + math;
        
        double average = sum / 3.0;
        
        if( average >=0 && average<= 100) {
            if(average >= 70){
                System.out.println("합격");
            }else {
                System.out.println("불합격");
            }                        
        }else {
            System.out.println("불합격");
        }
        scanner.close();
    }

}
