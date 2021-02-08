package Day0119;
import java.util.Scanner;
public class ExHomeWork3 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("생년을 입력하세요: ");
	int year = scanner.nextInt();
	
	System.out.println("생월을 입력하세요: ");
	int month = scanner.nextInt();
	
	System.out.println("생일을 입력하세요: ");
	int day = scanner.nextInt();
	
	System.out.printf("생년: %d년\n", year);
	System.out.printf("생월: %02d월\n", month);
	System.out.printf("생일: %02d일\n", day);
	
	System.out.printf("주민번호 앞자리 %02d%02d%02d", year%100, month, day);
	scanner.close();
    }

}
