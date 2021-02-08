package Day0121;
import java.util.Scanner;
public class StarPrinter07 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("---------------------별찍기 7번--------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber = scanner.nextInt();
	
	for(int i = 1; i <= userNumber; i++) {
	    String stars = new String();
	    
	    for(int j= 1; j <= userNumber; j++) {
		    stars += "*";
	    }
	    			
	   System.out.println(stars); 
	}
	
	
	
	System.out.println("---------------------별찍기 7번again--------------");
	
	// i for 문을 나눠서
	// if-else 문으로 안에 for문으로 컨트롤
	
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber2 = scanner.nextInt();

	
	//윗부분을 담당하는 i for문
	for(int i = 1; i <= userNumber2-1; i++) {	    
	    String stars = new String();
	    
	    for(int j = 1; j <= i; j++) {
		stars += "*";
	    }	    	    	    	    	    
	    System.out.println(stars);
	    
	}
	for(int i = 1; i <= userNumber; i++) {
	    String stars = new String();
	    for(int j = i; j <=userNumber; j ++) {
		stars +="*";
	    }
	    System.out.println(stars);
	}
	//아랫부분을 담당하는 i for문
	
	    
	scanner.close();
	
	
	
	
	
    }

}
