import java.util.Scanner;

public class Check {
	private Scanner scanner;
	private String[][] str;

	
	Check(String[][] str){
		scanner = new Scanner(System.in);
		this.str = str;

	}
	
	void checkSystem() {
		// ���Ź�ȣ ��ȸ
		scanner.nextLine();
		System.out.println("���Ź�ȣ�� �Է����ּ���");
		String serialNumber = scanner.nextLine();
		for(int col = 0; col<str.length; col++) {
			for(int row = 0; row<str[col].length; row++) {
				if(str[col][row].equals(serialNumber)) { // ������ �¼� ���
					System.out.printf("������ �����Ͻ� �¼��� %d-%d �Դϴ�.\n", col+1, row+1);
				}
				
			}
		}
	}
}
