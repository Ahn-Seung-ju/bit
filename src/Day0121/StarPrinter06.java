package Day0121;
import java.util.Scanner;
public class StarPrinter06 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("------------------별찍기 6번-----------------------");
	System.out.print("출력할 줄 수를 입력해주시여: ");
	int userNumber = scanner.nextInt();
	
	for(int i =1; i <= userNumber; i++) {
	    
	    
	    String stars = new String();
	    
	    for(int j = 1; j <= i-1; j++) {
		stars += " ";
	    
	    
	    
	    }for(int j = i; j <= -3 *userNumber + 13; j++) {
		stars += "*";
	    }
	    
	    
	    
	    
	System.out.println(stars);    
	}
	
	
	System.out.println("------------------별찍기 6번agian-----------------");
	System.out.print("출력할 줄 수를 입력하세요: ");
	int userNumber2 = scanner.nextInt();
	
	//int i가 1부터 userNumber 로 가는것이 아니라
	//int i가 userNumber부터 1로 가게 하기
	
	for(int i = userNumber2; i >= 1; i-- ) {
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
