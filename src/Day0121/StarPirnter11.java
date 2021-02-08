package Day0121;

import java.util.Scanner;

public class StarPirnter11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("-------------------별찍기 10번------------");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        

        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            for(int j = 2; j <= 2 * i -2; j++) {
                stars += " ";         
                
            }
            for(int j = i; j <= userNumber-1; j++) {
                stars += "*";
            }
                       

            System.out.println(stars);
        }
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
            for(int j = 1; j <= userNumber-i+1 ; j++) {
            stars += "*";
            }
            for(int j =1; j < 2 * i -1; j++) {
            stars += " ";
            }
            for(int j = 1; j <= userNumber-i ; j++) {
                stars += "*";
                }
            
            
            
            System.out.println(stars);
        }
        
        
        
        
        
        scanner.close();
        }


}
