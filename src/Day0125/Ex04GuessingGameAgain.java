package Day0125;
import java.util.Scanner;
import java.util.Random;
public class Ex04GuessingGameAgain {
    static final int MAX = 100;
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	//최고기록을 저장할 int 변수
	int bestScore = 0;
	
	while(true) {
	    System.out.println("1.시작 2. 최고점수 3. 종료");
	    int userChoice = scanner.nextInt();
	    if(userChoice == 1) {
		//플레이 코드 구현
		
		//사용자의 이번 점수를 저장할 int 변수 선언
		int currentScore = 1;
		
		System.out.print("숫자를 입력하세요: ");
		int userNumber = scanner.nextInt();
		
		// random을 사용하여 1~100 사이의 난수 생성
		int computerNumber = random.nextInt(MAX) + 1;
		
		while(userNumber != computerNumber) {
		    if(userNumber > computerNumber) {
			System.out.println("down");
		    }else {
			System.out.println("up");
		    }
		    
		    System.out.print("숫자를 입력하세요: ");
		    userNumber = scanner.nextInt();
		    currentScore++;
		}
		System.out.println("정답");
		System.out.println("이번 플레이의 점수는 "+currentScore+"입니다.");
		
		// 최고기록을 확인하여 필요하다면
		// 현재점수로 최고기록을 바꿔준다.
		
		// 최고기록을 현재기록으로 바꿔주는건 2가지 경우이다
		// 1. 처음 플레이했을때
		// 2. 최고기록이 현재기록보다 클때
		if(bestScore == 0 || bestScore > currentScore) {
		    bestScore = currentScore;
		    // bestScore 0을 1로 바꿔준다.
		    // bestScore이 currentScore보다 크면 현재 currnetScore을
		    // bestScore로 바꿔준다.
		    System.out.println("신기록입니다.");
		    
		}
		
		
	    }else if(userChoice == 2) {
		//최고 기록 코드 구현
		
		if(bestScore == 0) {
		    //아직 플레이 기록이 없으므로 경고 메시지만 출력
		    System.out.println("아직 플레이 기록이 없습니다.");
		}else {
		    System.out.println("현재 최고 기록: "+bestScore);
		}
		
	    }else if(userChoice == 3) {
		System.out.println("종료");
		break;
	    }
	}
	
	
	
	scanner.close();
    }

}
