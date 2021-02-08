package Day0126;

import java.util.Scanner;

public class Ex02LottoNumberGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
         int[] LottoArray = new int[6];
         
         for(int i = 0; i < LottoArray.length; i++) {
             System.out.print((i+1)+"번째 번호(1~45): ");
             int LottoNumber = scanner.nextInt();
             
             while(LottoNumber < 0 || LottoNumber > 45) {
                 System.out.println("잘못 입력하셨습니다.");
                 System.out.print((i+1)+"번째 번호(1~45): ");
                 LottoNumber = scanner.nextInt();
             }
             for(int j = 0; j < LottoArray.length; j++) {
                 if(LottoNumber == LottoArray[j]) {
                     System.out.println("중복 입력하셨습니다");
                     System.out.print((i+1)+"번째 번호(1~45): ");
                     LottoNumber = scanner.nextInt();
                     
                     j = -1;
                 }
             }
             
             LottoArray[i] = LottoNumber;

         }
         
         for(int i = 0; i < LottoArray.length; i++) {
             System.out.println(LottoArray[i]);
         }
         
         
         
         
         
         scanner.close();

     }


}
