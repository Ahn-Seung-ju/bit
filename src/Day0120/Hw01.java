package Day0120;
import java.util.Scanner;
public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("키를 m 단위로 입력해주세요: ");
        double height = scanner.nextDouble();
        
        System.out.println("몸무게를 kg 단위로 입력해주세요");
        
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        
        System.out.printf("사용자의 BMI 수치는 %.3f 입니다\n", bmi);
        
        scanner.close();
    }

}
