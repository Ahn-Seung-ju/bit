package Day0120;
//숙제1 : BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를
//       출력하는 프로그램을 작성하시오.
//       단 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지
//       다시 입력을 받으세요
import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키(m): ");
        double height = scanner.nextDouble();
        
        System.out.print("몸무게(kg): ");
        double weight = scanner.nextDouble();
        
        while(height >= 2.72 || height < 0 || weight >=465 || weight < 0 ) {
            System.out.println("키 혹은 몸무게를 잘못입력하였습니다. 다시 입력해주십시오");
           
            System.out.print("키(m): ");
            height = scanner.nextDouble();
            
            System.out.print("몸무게(kg): ");
            weight = scanner.nextDouble();            
        }
        
        double bmi = weight / height / height;
        System.out.printf("BMI 수치: %.3f\n", bmi);
        
        if(bmi < 18.5) {
            System.out.println("저체중 입니다.");
        }else if(bmi <23 ) {
            System.out.println("정상체중입니다.");
        }else if(bmi <25) {
            System.out.println("과체중입니다.");
        }else {
            System.out.println("비만입니다.");
        }

        scanner.close();
        
   }
}

