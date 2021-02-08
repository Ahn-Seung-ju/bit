import java.util.Scanner;

public class Check {
	private Scanner scanner;
	private String[][] str;

	
	Check(String[][] str){
		scanner = new Scanner(System.in);
		this.str = str;

	}
	
	void checkSystem() {
		// 예매번호 조회
		scanner.nextLine();
		System.out.println("예매번호를 입력해주세요");
		String serialNumber = scanner.nextLine();
		for(int col = 0; col<str.length; col++) {
			for(int row = 0; row<str[col].length; row++) {
				if(str[col][row].equals(serialNumber)) { // 예매한 좌석 출력
					System.out.printf("고객님이 예매하신 좌석은 %d-%d 입니다.\n", col+1, row+1);
				}
				
			}
		}
	}
}
