package Day0126;
// 로또번호 제작기 최종단계
// 컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
// 1등 6개
// 2등 5개
// 3등 4개
// 4등 3개
// 5등 2개

// 컴퓨터가 뽑은 숫자 6개중에서 내가 뽑은 숫자가 몇개가 일치하는 지 확인하고
// 등수를 표시하도록 
// 예
// 컴퓨터의 숫자:[2, 4, 27, 33, 41 45]
// 내숫자:[ 1 2 3 4 5 6 ]
// 내등수: 5등
import java.util.Scanner;
import java.util.Random;



public class Ex03LottoNumbers02 {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int[] lottoNumber = new int[SIZE];
        int[] computerLottoNumber = new int[SIZE];
        
        int same = 0;
        
        for(int i =0; i < lottoNumber.length; i++) {
            System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
            int userNumber = scanner.nextInt();
            
            while( userNumber < 0 || userNumber >45 ) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
                userNumber = scanner.nextInt();
            }
            for(int j = 0; j < lottoNumber.length; j++) {
                if(lottoNumber[j] == userNumber) {
                    System.out.println("중복");
                    System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
                    userNumber = scanner.nextInt();
                    
                    while( userNumber < 0 || userNumber >45 ) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
                        userNumber = scanner.nextInt();
                }
                    j = -1;
            } 
                
          }
            lottoNumber[i] = userNumber;
            
            
        }
        for(int i = 0; i < lottoNumber.length-1; i++) {
            if(lottoNumber[i] > lottoNumber[i+1]) {
                System.out.println(i+"번째 숫자보다"+(i+1)+"번째 숫자가 크므로 바꾼다.");
                int temp = lottoNumber[i];
                lottoNumber[i] = lottoNumber[i+1];
                lottoNumber[i+1] = temp;
                i = -1;
            }
        }
        
        for(int i = 0; i < lottoNumber.length; i++) {
            System.out.println(lottoNumber[i]);
        }
        
        for(int i = 0; i < computerLottoNumber.length; i++ ) {
            int computerNumber = random.nextInt(45)+1;
            computerLottoNumber[i] = computerNumber;
        }
        
        for(int i = 0; i < lottoNumber.length-1; i++) {
            if(computerLottoNumber[i] > computerLottoNumber[i+1]) {
                System.out.println(i+"번째 숫자보다"+(i+1)+"번째 숫자가 크므로 바꾼다.");
                int temp = computerLottoNumber[i];
                computerLottoNumber[i] = computerLottoNumber[i+1];
                computerLottoNumber[i+1] = temp;
                i = -1;
            }
        }
        for(int i = 0; i < lottoNumber.length; i++) {
            System.out.println(computerLottoNumber[i]);
        }
        
        
        scanner.close();
        
    }

}
