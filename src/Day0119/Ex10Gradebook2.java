package Day0119;
// 사용자로부터
// 나이 이름
// 국어 영어 수학
// 순으로 입력 받아서
// 나이, 이름, 국어, 영어, 순학, 총점, 평균
// 이 출력되는 프로그램을 작성하시오

 import java.util.Scanner;
public class Ex10Gradebook2 {
    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 //이름 입력
	 System.out.println("사용자의 이름을 입력하세요. " );
         scanner.nextLine();
	 String name = scanner.nextLine();
	 
	 //나이 입력
	 System.out.println("사용자의 나이를 입력하세요. ");
	 int age = scanner.nextInt();
	 

	 //국어 점수 입력
	 System.out.println("사용자의 국어점수를 입력하세요");
	 int korean = scanner.nextInt();
	 
	 //영어 점수 입력
	 System.out.println("사용자의 영어점수를 입력하세요");
	 int english = scanner.nextInt();
	 
	 //수학 점수 입력
	 System.out.println("사용자의 수학점수를 입력하세요");
	 int math = scanner.nextInt();

	 // 총점
	 int sum = korean + english + math;	 

	 // 평균
	 double d = sum / 3.0;
	 
	 
	 
	 System.out.println("사용자의 나이: "+age);
	 System.out.println("사용자의 이름: "+name);	 
	 
	 System.out.println("사용자의 국어점수: "+ korean);	 
	 System.out.println("사용자의 영어점수: "+ english);	 
	 System.out.println("사용자의 수학점수: "+ math);	 

	 System.out.println("사용자의 총점: "+sum);
	 System.out.println("사용자의 평균: "+d);
	 
	 scanner.close();
	
    }   

}
