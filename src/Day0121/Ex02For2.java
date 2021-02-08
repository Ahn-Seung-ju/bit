package Day0121;
// 1. 1부터 10까지 출력되는 for문작성
//2. 8부터 3까지 출력되는 for문 작성
// 3. 사용자로부터 시작 숫자와 끝숫자를 입력받아
//    그 숫자들을 차례대로 출력
// 5. 사용자로부터 숫자를 하나 입력받아
//    1부터 그수까지 합을 구하시오
// 4 사용자로부터 숫자하나입력받아
//   1부터 그수의 홀수들만 출력
// 6 사용자로부터 숫자하나 입력받아
//   1부터 그수까지의 곱을 구하시오
import java.util.Scanner;
public class Ex02For2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int start = 1;
	int end = 10;
	for(int i = start; i <= end; i++ ) {
	    System.out.println(i);
	}
	System.out.println("---------------2번-------------------");
	
	int start2 = 8;
	int end2 = 3;
	for(int i = start2; i >= end2; i--) {
	    System.out.println(i);
	}
	System.out.println("----------------3번-------------------");
	
	System.out.print("시작 숫자: ");
	int start3 = scanner.nextInt();
	
	System.out.print("끝 숫자: ");
	int end3 = scanner.nextInt();
	
	if(start3<=end3) {
	    for(int i = start3; i <= end3; i++) {
	        System.out.println(i);
           }
	}else {
	    for(int i = start3; i >= end3; i--) {
	        System.out.println(i);
	   }
	}    
	
	
	System.out.println("-----------------5번------------------");
	
	start = 1;
	System.out.println("숫자: ");	
	end = scanner.nextInt();
	// i의 값을 저장하기 위해 for문 앞에 변수를 선언해야한다.
	// for문 안에 변수를 넣으면 초기화가 된다. 고로 
	int sum = 0;
	for(int i = start; i <= end; i ++) {
	    sum +=i;
	    
	}
	System.out.printf("1부터 %d 까지의 합: %d\n",end , sum);
	System.out.println("-----------------6번------------------");
	
	start = 1;
	System.out.println("숫자: ");
	end = scanner.nextInt();
	int factorial = 1;
	
	
	if(end>=13) {
	    System.out.println("오버플로우가 발생하여 정확한 값을 출력할 수 없습니다.");
	}else {
	    for(int i = start; i <=end; i++) {
		    factorial *= i;
	    }	    
	}
	    
	
	System.out.printf("1부터 %d까지의 합: %d\n",end, factorial);
	
	
	
	System.out.println("-----------------4번------------------");
	
	start = 1;
	System.out.println("숫자: ");
	end = scanner.nextInt();
	
	for(int i = start; i <= end; i++) {
	    if(i % 2 == 1) {
		System.out.println(i);
		
       
	    }
	}
	
	
	System.out.println("-----------------6번------------------");
    scanner.close();
   }
}


    
   

