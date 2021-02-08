package Day0119;

import java.util.Scanner;
public class ExHomeWork2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	   System.out.println("첫번 째 숫자를 입력하십시오");
	   double number1 = scanner.nextDouble();
	   
	   System.out.println("두번 째 숫자를 입력하십시오");	   
	   double number2 = scanner.nextDouble();
	   
	   double sum = number1 + number2;
	   
	   double Sub = number1 - number2;
	   
	   double division = number1 / number2;
	   
	   double multi = number1 * number2;
	   	   
	   System.out.println("number1 + number2: "+ sum );
	   System.out.println("number1 - number2: "+ Sub );
	   System.out.println("number1 / number2: "+ division );
	   System.out.println("number1 * number2: "+ multi );
	   

	   
	    scanner.close();

	
    }
    

    
    

}
