package Practice;
//로또번호 제작기 최종단계
//컴퓨터가 뽑은 숫자 6개 vs 내가 뽑은 숫자 6개
//1등 6개
//2등 5개
//3등 4개
//4등 3개
//5등 2개

//컴퓨터가 뽑은 숫자 6개중에서 내가 뽑은 숫자가 몇개가 일치하는 지 확인하고
//등수를 표시하도록 
//예
//컴퓨터의 숫자:[2, 4, 27, 33, 41 45]
//내숫자:[ 1 2 3 4 5 6 ]
//내등수: 5등
import java.util.Random;
import java.util.Scanner;
public class RP03 {
    static final int SIZE = 6;
    static final int MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int[] computerArray = new int [SIZE];
        int[] userArray = new int [SIZE];
        
        // 컴퓨터 
        for(int i = 0; i < computerArray.length; i++) {
            int computerNumber = random.nextInt(MAX) + 1;
            for(int j = 0; j < computerArray.length; j++) {
                if(computerNumber == computerArray[j]) {
                    computerNumber = random.nextInt(MAX)+1;
                    j = -1;
                }
            }
            computerArray[i] = computerNumber;
        }
        
        for(int i = 0; i < computerArray.length-1; i++) {
            if(computerArray[i] > computerArray[i+1]) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i+1];
                computerArray[i+1] = temp;
                
                i = -1;
            }
        }
        
        
        // 사용자
        for(int i = 0; i < userArray.length; i++) {
            System.out.println("숫자를 입력하세요(1~45)");
            System.out.print(">");
            int userNumber = scanner.nextInt();
            
            while(userNumber < 0 || userNumber > MAX) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("숫자를 입력하세요(1~45)");
                System.out.print(">");
                userNumber = scanner.nextInt();
            }
            for(int j = 0; j < userArray.length; j++) {
                if(userArray[j] == userNumber) {
                    System.out.println("중복");
                    System.out.println("숫자를 입력하세요(1~45)");
                    System.out.print(">");
                    userNumber = scanner.nextInt();
                    while(userNumber < 0 || userNumber > MAX) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("숫자를 입력하세요(1~45)");
                        System.out.print(">");
                        userNumber = scanner.nextInt();                    
                    } 
                    j = -1;
                }
            }
            userArray[i] = userNumber;
           
            
        }
        for(int i = 0; i < userArray.length - 1; i++) {
            if(userArray[i] > userArray[i+1]) {
                int temp = userArray[i];
                userArray[i] = userArray[i+1];
                userArray[i+1] = temp;
                i = -1;
                                
            }
        }        
        // 비교
        System.out.printf("컴퓨터: [%d, %d, %d, %d, %d, %d]\n", 
                computerArray[0], computerArray[1], computerArray[2],
                computerArray[3], computerArray[4], computerArray[5]);
        
        System.out.printf("사용자: [%d, %d, %d, %d, %d, %d]\n", 
                userArray[0], userArray[1], userArray[2],
                userArray[3], userArray[4], userArray[5]);
        
        int score = 0;
        
        for(int i =0; i < userArray.length; i++) {
            for(int j = 0; j < computerArray.length; j++) {
                if(userArray[i] == computerArray[j]) {
                    score++;
                }
            }
        }
        switch(score) {
        case 6 :
            System.out.println("1등");
            break;
        case 5 :
            System.out.println("2등");
            break;
        case 4 :
            System.out.println("3등");
            break;
        case 3 :
            System.out.println("4등");
            break;
        case 2 :
            System.out.println("5등");
            break;
        default :
            System.out.println("뭔등이야");
            break;
        }
        
        scanner.close();
    }

}
