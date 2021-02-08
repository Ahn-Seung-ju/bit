package Practice;
import java.util.Scanner;
public class PR02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("다이아몬드 별찍기");
        System.out.print("출력할 줄수를 입력하세요: ");        
        int userNumber = scanner.nextInt();

               
       
        for(int i = 1; i <= 2 * userNumber - 1; i++ ) {
            String stars = new String();
            
            int totalWidth = 2 * userNumber - 1;
            if( i == 1 || i == totalWidth) {
                for(int j = 1; j <= 2 * userNumber - 1; j++) {
                    stars += "*";
                }
            }else if(i <= userNumber -1 ) {
                int upperI = i - 1;
                int starsWidth = userNumber - upperI;
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";                    
                }
                int spaceWidth = totalWidth - 2 * starsWidth;
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                    
                }
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";
                }    
            }else {
                int lowerI = i -userNumber +1;
                int starsWidth = lowerI;
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";
                    
                }
                int spacewidth = totalWidth - 2 * starsWidth;
                for(int j = 1; j <= spacewidth; j++) {
                    stars += " ";
                }
                for(int j = 1; j <= starsWidth; j++) {
                    stars += "*";
                }
            }

            
            
            
            
            System.out.println(stars);
            
        }
            
        
        
        
        
        
        
        
        
        scanner.close();
    }

}
