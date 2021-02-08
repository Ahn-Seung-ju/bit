package Day0126;
import java.util.Scanner;
public class Ex02LottoNumberAgain {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] lottoNumbers = new int [SIZE];
        for(int i = 0; i <lottoNumbers.length; i++) {
            System.out.println(i+"번쨰 숫자를 입력해주세요: ");
            int userNumber = scanner.nextInt();
            while(userNumber < 0 || userNumber >45 ) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print(i+"번째 숫자를 입력해주세요: ");
                userNumber = scanner.nextInt();
            }
            for(int j = 0; j <lottoNumbers.length; j++) {
                if(lottoNumbers[j]== userNumber) {
                    System.out.println("중복된 숫자입니다.");
                    System.out.print(i+"번째 숫자를 입력해주세요: ");
                    userNumber = scanner.nextInt();
                    
                    while(userNumber < 0 || userNumber >45 ) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.print(i+"번째 숫자를 입력해주세요: ");
                        userNumber = scanner.nextInt();
                    }
                    j = -1;
                    
                }
            }
            lottoNumbers[i] = userNumber;
            
        }
        
        
        for(int i = 0; i < lottoNumbers.length - 1; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1] ) {
                System.out.println(i+"번째가 "+(i+1)+"번째보다 크므로 바꾼다.");
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                
                i =-1;
            }
        }
        
        
        for(int i = 0; i <lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }
        
        
        scanner.close();
        
    }

}
