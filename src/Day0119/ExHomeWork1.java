package Day0119;

import java.util.Scanner;
public class ExHomeWork1 {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("키를 입력하세요");
	double height = scanner.nextDouble();
	
	System.out.println("몸무게를 입력하세요");
	double kg = scanner.nextDouble();
	
	double bmi = (kg / height / height )*10000;
	
	System.out.printf("당신의 BMI 수치는 %.2f 입니다.", bmi);
	
	scanner.close();
    }

}
