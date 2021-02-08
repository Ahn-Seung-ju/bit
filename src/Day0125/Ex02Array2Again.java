package Day0125;
//1. 크기가 4인 int 배열을 만들어서
//3-4 22 11 이란 값을넣어보세요
//2. 크기가 3인 String 배열을 만들어서 
//"김철수" "이영희" "Jane Doe" 란 값을 넣어보세요
//3. 크기가 6인 배열을 만들어서
//사용자로부터 1~45의 값을 입력하도록 하시오
//단 사용자가 범위를 벗어난 값을 입력하면 올바른 범위의 값이 들어올때까지
//다시 입력을 받으세요
//4. 사용자로부터 3개의 이름을 입력받아 String 배열에 저장하세요
import java.util.Scanner;


public class Ex02Array2Again {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("--------------예제 1번------------");
	
	
	int intArray[] = new int[4];
	
	for(int i = 0; i < 4; i++) {
	    intArray[0] = 3;
	    intArray[1] = -4;
	    intArray[2] = 22;
	    intArray[3] = 11;
	    
	    System.out.printf((i+1)+"번째 숫자: %d\n", intArray[i]);
	}
	
	System.out.println("---------------------------");
	
	System.out.println("-------------예제 2번--------------");
	
	String[] strArray = new String[3];
	
	for(int i = 0; i < 3; i++) {
	    strArray[0] = "김철수";
	    strArray[1] = "이영희";
	    strArray[2] = "jane Doe";
	    
	    System.out.printf((i+1)+"번째 이름: %s\n", strArray[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	scanner.close();
    }

}
