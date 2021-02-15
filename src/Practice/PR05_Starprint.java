package Practice;

import java.util.Scanner;

public class PR05_Starprint {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int userNum = scanner.nextInt();
        int totalwidth = 2 * userNum -1;
        for(int i = 1; i <= totalwidth ; i++) {
            String star = new String();
            if(i == 1 || i == totalwidth) {
                for(int j = 1; j <= totalwidth; j++) {
                    star += "*";
                }
            }else if(i <= userNum -1) {
                int uperi = i - 1;
                int starwidth = userNum - uperi;
                for(int j = 1; j <= starwidth; j++) {
                    star += "*";
                }
                int spacewidth = totalwidth - 2 * starwidth;
                for(int j = 1; j <= spacewidth; j++) {
                    star += " ";
                }
                for(int j = 1; j <= starwidth; j++) {
                    star += "*";
                }
            }else {
                int downi = i - userNum + 1;
                int starwidth = downi;
                for(int j = 1; j <= starwidth; j++ ) {
                    star += "*";
                }
                int spascwidth = totalwidth - 2 * starwidth;
                for(int j = 1; j <= spascwidth; j++) {
                    star += " ";
                }
                for(int j = 1; j <= starwidth; j++ ) {
                    star += "*";
                }
            }
            
            
            
            
            System.out.println(star);
        }
        
        
        
        scanner.close();
    }

}
