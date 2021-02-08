package Day0129;

import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {
    public static void main(String[] args) {
	Fclass fclass = new Fclass();
	fclass.m();
	fclass.m2(100);
	
	int result = fclass.m3();
	System.out.println(result);
	
	result = fclass.m4(200);
	System.out.println(result);
	
	result = fclass.sum(10, 20,30);
	System.out.println(result);
	
	
	fclass.callSubSum();
	
	result = fclass.callSubSum2(500);
	System.out.println(result);
	
	boolean bo = fclass.opSum(result+1);
	System.out.println(bo);
	
	result = fclass.max(500, 300);
	System.out.println(result);
	
	//그림 질문하기
	Tv tv = fclass.tCall();// Tv 타입을 가지는 주소값을 받는다
	System.out.println(tv.brand);
	
	//그림 질문하기
	Tv tv2 = new Tv();
	System.out.println("tv2 :" + tv2);
	fclass.tcall2(tv2); //주소값 전달
	System.out.println(tv2);
	
	String result2 = fclass.str(55);
	System.out.println(result2);
    }

}
