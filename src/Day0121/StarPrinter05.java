package Day0121;
import java.util.Scanner;
public class StarPrinter05 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("------------------별찍기 5번-----------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int usernumber = scanner.nextInt();
	
	
	for(int i = 1; i <=usernumber; i++) {
	    String stars = new String();
		for(int j = 1; j <= usernumber - i; j++) {
		    stars += " ";
		}for(int j = 1; j <= i; j++) {
		    stars += "*";
		}for(int j = 2; j <= i; j++) {
		    stars += "*";
		}for(int j = 1; j <= usernumber - i; j++) {
		    stars += " ";
		}
		System.out.println(stars);
	    }

	
	
	
	
	//====================================================================
	
	System.out.println("------------------별찍기 5번agian-----------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber2 = scanner.nextInt();
	
	for(int i = 1; i <= userNumber2; i++ ) {
	    String stars = new String();
	    //공백을 담당하는 for문
	    for(int j = 1; j <= userNumber2 - i; j++) {
		stars += " ";
		
		
	    }
	    for(int j = 1; j <= 2*i -1; j++)
		stars += "*";
	    
	    
	    
	    
	    
	    
	    System.out.println(stars);
	}
	
	scanner.close();
    }

}
