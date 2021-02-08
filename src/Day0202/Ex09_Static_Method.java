package Day0202;
/*
1. static member field(객체간 공유자원)

2. static method: 자주 쓰이니까... >> 편하게 사용하게 >> 객체를 생성하지 없이도 사용 >> static 
   why: Math.ramdom() >> Math m = new Math(); m.random() 어떻게 하지 않았을까?
   
 */
//import java.lang.*; default (생략)

class StaticClass{
    int iv;
    
    static int cv;
    
    void m() {
	//일반함수에서 
	//cv 값을 가지고 놀수 있다
	//순서...
	//static 자원은 일반자원보다 항상 메모리에 먼저 상주
	
	cv = 100;
	//StaticClass.cv = 100;
    }
    static void sm() {
	//static 함수에서
	//일반자원인 iv를 가지고 놀 수 있다(X)
	//순서상 static이 먼저 들어가기 때문에 일반자원을 찾을 수 없다.
	//iv = 100; 생성시점때문에 에러
	//error가 없게 하려면 (static끼리 놀아라)
	cv = 222;
    }
}

public class Ex09_Static_Method {
    
    public static void main(String[] args) {
	
	
	System.out.println(StaticClass.cv);
	StaticClass.sm();
	System.out.println(StaticClass.cv);
	
	//일반자원은 (객체생성)
	StaticClass sc = new StaticClass();
	sc.m();
	sc.sm();
	System.out.println(sc.iv);
	System.out.println(sc.cv);
	
	
    }

}
