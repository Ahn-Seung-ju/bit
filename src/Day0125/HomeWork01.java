package Day0125;
//숙제
//가위바위보 게임을 만드세요
//가위: int 1
//바위: int 2
//보: int 3

//예시: 가위바위보 중 하나를 선택(가위: 1 바위: 2 보: 3)
//>5
//잘못입력하셨습니다.
//가위바위보 중하나를 선택(가위: 1 바위: 2 보: 3)
//사용자 가위
//컴퓨터 보
//사용자 승!!
//현재전적: 1 승 3무 3패
//1. 플레이 2. 현재 전적 보기 3. 종료
//현재 전적은 1승 3무2패입니다. 승률은 16.6667퍼센트입니다
//1. 플레이 2. 현재 전적 보기 3. 종료
//>3
//종료
import java.util.Scanner;
import java.util.Random;
public class HomeWork01 {
    static final int OPTION_START = 1;
    static final int OPTION_PRINT = 2;
    static final int OPTION_END = 3;
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	int win = 0;
	int lose = 0;
	int draw = 0;
	while(true) {
	    System.out.println("1. 시작 2. 전적 3. 종료");
	    System.out.print(">");
	    int userChoice = scanner.nextInt();
	    
	    if( userChoice == OPTION_START) {
		
		System.out.println("가위: 1 바위: 2 보: 3");
		int userNumber = scanner.nextInt();		
		int computerNumber = random.nextInt(3)+1;
				
		int loser = userNumber - computerNumber;
		int winner = computerNumber - userNumber;
		
		if(userNumber == computerNumber) {
		    System.out.println("사용자: "+userNumber);
		    System.out.println("컴퓨터: "+computerNumber);
		    System.out.println("무승부");
		    
		    draw++;
		    
		}else if(loser == -1 || loser == 2 ) {
		    System.out.println("사용자: "+userNumber);
		    System.out.println("컴퓨터: "+computerNumber);
		    System.out.println("패배");
		    		    
		    win++;
		    
		}else if(winner == -1 || winner == 2){
		    System.out.println("사용자: "+userNumber);
		    System.out.println("컴퓨터: "+computerNumber);
		    System.out.println("승리");
		    
		    lose++;
		}
		System.out.printf("현재 전적 %d승 %d무 %d패\n", win, draw, lose);
		
		
	    }else if (userChoice == OPTION_PRINT) {
		int sum = win + draw + lose;
		double winningAverage = ((double)win / (double)sum) * 100;
		
		System.out.printf(" 현재 전적은 %d승 %d무 %d패 승률은 %.3f퍼센트 입니다\n", win, draw, lose, winningAverage);
	    }else if (userChoice == OPTION_END) {
		System.out.println("종료");
		break;
	    }else {
		System.out.println("잘못입력하셨습니다.");		
	    }
	    
	}
	
	scanner.close();
    }
    
    

}
