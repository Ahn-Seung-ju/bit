package Day0120;
// 하드코딩이란?
// "경직된" 코딩이란 의미로써 변경은 어려운 형태의 코딩
// 장점: 바르다. 쉽다
// 단점: 유지보수가 어렵다

// 소프트코딩이란?
// "유연한" 코딩이란 의미로써 변경이 쉬운 형태의 코딩
// 장점: 유지보수가 쉽다.
// 단점: 쉬운 난이도의 프로그래밍에서는 오히려 코딩의 난이도를 높여버린다.

// 하드코딩과 소프트코딩의 가장 큰 차이점:
// 상수 혹은 변수를 적극적으로 사용했나 안했나가 된다.

// 리팩토링이란?
// 코드의 결과는 바뀌지 않지만 내부적으로 더욱 효율적인 코드로
// 교체하는 것을 리팩토링이라고 한다.

import java.util.Scanner;
public class Ex11GradeBookAgain {
    static final int MIN_SCORE_LIMIT = 60;
    static final int MIN_SUM_LIMIT = 210;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("국어: ");
        int korean = scanner.nextInt();
        
        System.out.print("영어: ");
        int english = scanner.nextInt();
        
        System.out.print("수학: ");
        int math = scanner.nextInt();        
        int sum = korean + english + math;
        
        if(korean >= MIN_SCORE_LIMIT && 
                english >= MIN_SCORE_LIMIT && 
                math >= MIN_SCORE_LIMIT &&
                sum>= MIN_SUM_LIMIT) {
            System.out.println("합격");
            
        }else {
            System.out.println("불합격");
        }
        
        scanner.close();
    }

}
