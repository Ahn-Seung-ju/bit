package Practice;
import java.util.Scanner;
public class PR01 {
   
    
    
    static final int OPTION_INTSERT = 1;
    static final int OPTION_PRINT = 2;
    static final int OPTION_END = 3;
    static final double MAX_HEIGHT = 2.72;
    static final double MAX_WEIGHT = 465;
    static final double LOW_WEHGHT_BMI = 18;
    static final double NOMAL_WEIGHT_BMI = 23;
    static final double OVER_WEIGHT_BMI = 25;
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double weight = 0;
        double height = 0;
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print(">");
            double userChoice = scanner.nextDouble();
            
            if( userChoice == OPTION_INTSERT ) {
                System.out.print("키(m): ");
                height = scanner.nextDouble();
                while(height > MAX_HEIGHT || height <= 0) {
                    System.out.print("키를 잘못 입력하셨습니다. m단위로 입력해주세요: ");
                    System.out.print("키(m): ");
                    height = scanner.nextDouble();                    
                    
                }
                System.out.print("몸무게(kg): ");
                weight = scanner.nextDouble();
                while( weight > MAX_WEIGHT || weight <=0 ) {
                    System.out.print("몸무게를 잘못 입력하셨습니다. kg 단위로 압력해주세요: ");
                    System.out.println("몸무게(kg): ");
                    weight = scanner.nextDouble();
                    
                }
            }else if( userChoice == OPTION_PRINT) {
                if( weight == 0) {
                    System.out.println("아직 입력된 값이 없습니다.");
                    
                }else {
                    double bmi = weight / height / height;
                    
                    if( bmi <= LOW_WEHGHT_BMI ){
                        System.out.printf("당신의 BMI수치는 %.2f이며 저체중입니다.\n", bmi);
                    }else if( bmi <= NOMAL_WEIGHT_BMI ) {
                        System.out.printf("당신의 BMI수치는 %.2f이며 정상체중입니다.\n", bmi);
                    }else if( bmi <= OVER_WEIGHT_BMI ) {
                        System.out.printf("당신의 BMI수치는 %.2f이며 과체중입니다.\n", bmi);
                    }else {
                        System.out.printf("당신의 BMI수치는 %.2f이며 비만입니다.\n", bmi);
                    }
                }
                
                
            }else if( userChoice == OPTION_END ) {
                
                System.out.println("이용해주셔서 감사합니다.");
                break;
                
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
            
            
            
        }
        
         
        
        
        
        scanner.close();
        
    }

}
