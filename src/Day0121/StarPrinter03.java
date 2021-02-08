package Day0121;
import java.util.Scanner;
public class StarPrinter03 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("--------------별찍기 3번--------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber = scanner.nextInt();
	
	for(int i = 1; i <= userNumber; i++) {
	    String stars = new String();
	    String blank = new String();
	    //공백을 담당하는 for 문
	    for(int j = i; j <=userNumber-1; j++) {
		blank += " ";
		
             // *을 담당하는 for 문
	    }for(int j = 1; j <= i; j++) {
		stars += "*";
		
	    }
	    System.out.println(blank + stars);
	    
	    
	}
	
	//=====================================================================
	
	System.out.println("--------------별찍기 3번again--------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber2 = scanner.nextInt();
	
	for(int i = 1; i <= userNumber2; i++) {
	    String stars = new String();
	
	    for(int j = 1; j <= userNumber2-i; j++) {
	    stars += " ";
	    }for(int j = 1; j <=i ; j++) {
	    stars += "*";
	    }System.out.println(stars);
	}
	
	
	scanner.close();
    }

}
