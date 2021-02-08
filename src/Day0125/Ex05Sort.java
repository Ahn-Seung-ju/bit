package Day0125;
// 정렬
// 정렬이란?
// 값에 다라서 오름차순 혹은 내림차순으로
// 배열 안의 값들을 정리해주는 것
// 오름차순: 인덱스가 작을수록 값도 작음
// 내림차순: 인덱스가 작을수로 값은 큼

// 직접 정렬을 만들어보자

// 앞뒤를 비교하여 
public class Ex05Sort {
    public static void main(String[] args) {
	int[] intArray = {3, 1, 9, 4, 8, 2};
	for(int i =0; i < intArray.length; i++) {
	    System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
	}
	// 구현할 정렬 방법은
	// 인덱스와 그 다음 인덱스의 값을 비교해서
	// 만약 다음 인덱스가 더 작으면
	// 두개의 위치를 바꿔주고 처음부터 다시 검사하는 형식으로
	// 진행하게 된다.
	
	for(int i =0; i< intArray.length -1; i++) {
	    if(intArray[i]> intArray[i+1]) {
		System.out.println(i+"번째가 "+(i+1)+"번째보다 크므로 바꾼다.");
		int temp = intArray[i];
		intArray[i] = intArray[i+1];
		intArray[i+1] = temp;
		
		//i++할때 i를 0으로 초기화하여 검토하기 위해
		i = -1;
		System.out.printf("%d %d %d %d %d %d\n",
			intArray[0], intArray[1], intArray[2],
			intArray[3], intArray[4], intArray[5]);
		
	    }
	    
	}
    }
    

}


//숙제
// 가위바위보 게임을 만드세요
// 가위: int 1
// 바위: int 2
// 보: int 3

// 예시: 가위바위보 중 하나를 선택(가위: 1 바위: 2 보: 3)
//>5
// 잘못입력하셨습니다.
//가위바위보 중하나를 선택(가위: 1 바위: 2 보: 3)
// 사용자 가위
// 컴퓨터 보
// 사용자 승!!
//현재전적: 1 승 3무 3패
// 1. 플레이 2. 현재 전적 보기 3. 종료
// 현재 전적은 1승 3무2패입니다. 승률은 16.6667%입니다
// 1. 플레이 2. 현재 전적 보기 3. 종료
//>3
// 종료
