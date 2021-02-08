package Day0122;
import java.util.Scanner;
public class StarPrinter09Again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("***********별찍기 9번*********");
        System.out.print("출력할 줄 수를 입력하시오: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2 * userNumber -1; i++) {
            String stars = new String();
            if( i <= userNumber -1) {
                for(int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }
                for(int j = 1; j <= 2* i - 1; j++) {
                    stars += "*";
                    
                }
                
            }else {
                int lowerI = i - userNumber + 1;
                for(int j = 1; j <= lowerI-1; j++) {
                    stars += " ";
                }

            }
            System.out.println(stars);
        }
        
        
        System.out.println("----------------------------------------");

        System.out.println("***********별찍기 9번*********");
        System.out.print("출력할 줄 수를 입력하시오: ");
        
        int userNumber2 = scanner.nextInt();
        
        for (int i = 1; i <= 2 * userNumber2 -1; i ++) {
            String stars = new String();
            if( i <= userNumber2-1) {
                // 윗부분
                
                //공백을 담당하는 j for 문
                for(int j = 1; j < userNumber2 -i+1; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for문
                for(int j = 1; j <= 2 * i - 1; j++) {
                    stars += "*";
                }
            }else {
                // 아랫부분
                // i -> 5 6 7 8 9
                //   -> 5 4 3 2 1 
                // 2 * userNumber - i
                
                int lowerI = 2 * userNumber2 - i;
                
                // 공백을 담당하는 j for 문
                for(int j = 1; j <= userNumber2 - lowerI; j++) {
                    stars += " ";
                }
                for(int j = 1; j <= 2 * lowerI - 1; j++) {
                    stars += "*";
                }
            }
            System.out.println(stars);
        }

        
        
        
        
        
        scanner.close();
    }

}
