package Day0126;
// 사용자로부터 로또 번호를 입력받는 프로그램
// 단 해당번호가 중복이거나 1~45를 벗어나는 값이면
// 다시 입력을 받도록 만드시오
import java.util.Scanner;

public class Ex02LottoNumbers01 {
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
