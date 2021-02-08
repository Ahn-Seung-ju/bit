package Day0125;
// 컴퓨터가 만들어낸 1~100 사이의 랜덤한 숫자를
// 사용자가 몇번만에 맞추는지 기록하는
// 숫자맞추기 게임
// 조건 1. 무한루프를 사용해서
//        사용자가 1을 누르면 게임시작
//        2를 누르면 최고점수 보기
//        3을 누르면 종료
//        단 최고 점수는 가장 적은 횟수로 컴퓨터의 숫자를 맞춘 횟수가 최고점수가 됩니다.

// 힌트1. 최고점수는 어떻게 기록?
//       최고점수는 맨 처음 플레이하면 어떤게 최고점수가 될까?
// 힌트2. random.nextInt(최대값)을 입력하면
//       0부터 최대값-1 까지의 값이 랜덤하게 나온다.
//       그렇다면 어떻게 해야 1~최대값의 범위가 나오도록
//       만들어줄 수 있을까?
//       random.nextInt(10) -> 0 1 2 3 4 5 6 7 8 9
//       random.nextInt(10) + 1 -> 1 2 3 4 5 6 7 8 9 10

import java.util.Scanner;
import java.util.Random;
public class Ex04GuessingGame {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	
	int bestScore = 0;
	while(true) {
	    System.out.println("1. 게임 시작 2. 최고점수 3. 종료");
	    System.out.print(">");
	    int userChoice = scanner.nextInt();

	    
	    if( userChoice == 1) {
		int currentScore= 1;
		System.out.println("숫자를 입력하세요");
		System.out.print(">");
		
		int userNumber = scanner.nextInt();
		int computerNumber = random.nextInt(100)+1;				
		
		while(userNumber != computerNumber) {
		    if(userNumber > computerNumber) {
			System.out.println("down");			
		    }else {
			System.out.println("up");
			
		    }
		    System.out.println("숫자를 입력하세요");
		    System.out.print(">");
		    userNumber = scanner.nextInt();		    
		    currentScore++;
		}
		System.out.println("정답");
		System.out.println("현재 스코어는 "+currentScore+"입니다");
		
		
		if(bestScore == 0 || bestScore > currentScore) {
		    System.out.println("신기록");
		    bestScore = currentScore;
		}
		
		
	    }else if(userChoice == 2) {
		if(bestScore == 0) {
		    System.out.println("아직 숫자를 입력하지 않았습니다.");
		}else {
		    System.out.println("현재 최고점수는"+bestScore+"입니다.");
		    
		}
		
		
	    }else if(userChoice == 3) {
		System.out.println("종료");
		break;
	    }
	    
	}
	
	
	
	
	scanner.close();
    }
    


}
