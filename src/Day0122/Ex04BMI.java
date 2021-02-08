package Day0122;
//BMI 계산기에 메뉴를 적용 프로그램 만들기
import java.util.Scanner;
public class Ex04BMI {
    
    
    static final int OPTION_INSERT = 1;
    static final int OPTION_PRINT = 2;
    static final int OPTION_END = 3;            
    static final double MAX_HEIGHT = 2.72;
    static final double MAX_WEIGHT = 465;
    static final double LOW_WEHGHT_BMI = 18;
    static final double NOMAL_WEIGHT_BMI = 23;
    static final double OVER_WEIGHT_BMI = 25;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double height = 0;
        double weight = 0;

        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print(">");
            int userNumber = scanner.nextInt();
            if( userNumber == OPTION_INSERT) {
                System.out.print("키(m): ");
                height = scanner.nextDouble();
                                
                while( height <= 0 || height > MAX_HEIGHT) {
                    System.out.println("잘못 입력하셨습니다");
                    System.out.print("키(m): ");
                    height = scanner.nextDouble();
                }
                
                System.out.print("몸무게(kg): ");
                weight = scanner.nextDouble();
                
                while( weight <= 0 || weight > MAX_WEIGHT) {
                    System.out.println("잘못 입력하셨습니다");
                    System.out.print("몸무게(kg): ");
                    weight = scanner.nextDouble();
                }
            }else if( userNumber == OPTION_PRINT) {
                //경고메세지
                if( weight == 0) {
                    System.out.println("아직 입력한값이 없습니다.");
                }else {                
                double bmi = weight / height / height;
                
                if(bmi <= LOW_WEHGHT_BMI ) {
                    System.out.printf("당신의 BMI수치는 %.2f이며 저체중입니다.\n", bmi);
                }else if(bmi <= NOMAL_WEIGHT_BMI) {
                    System.out.printf("당신의 BMI수치는 %.2f이며 정상체중입니다.\n", bmi);
                }else if(bmi <= OVER_WEIGHT_BMI ) {
                    System.out.printf("당신의 BMI수치는 %.2f이며 과체중입니다.\n", bmi);
                }else {
                    System.out.printf("당신의 BMI수치는 %.2f이며 비만입니다.\n", bmi);
                }
                }
            }else if( userNumber == OPTION_END ) {
                
                System.out.println("종료");
                break;
                
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
            
        }
        
        
        
        
        scanner.close();
    }

}
