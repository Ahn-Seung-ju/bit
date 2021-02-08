package kr.or.bit;
/*
 * 클래스 구성요소 (필드 + 함수)
 * 
 * 기능(행위) 만드는 방법
 * 함수(function, method)
 * method: 행위 또는 기능을 정의(최소단위): 하나의 함수는 하나의 기능만 구현
 * ex) 먹는다, 잔다, 걷는다 
 * 동시에 할 수 없다. 
 * ex) 먹으며 것는다 x
 * 함수는 호출에 의해서만 동작 (누군가 그의 이름)
 * 
 * Java)
 * 1. void, parameter(O)        >> void print(string str) {실행코드} 
 *    무언가 받는다 돌려주는 않는다
 * 2. void, parameter(X)        >> void print() {실행코드}
 * 3. return type, parameter(O) >> int print(int data) {return data + 10;}
 * 4. return type, parameter(X) >> int print(){return 100;}
 * 
 * 용어
 * void: 돌려주는 것이 없다. >> return value가 없다
 * return type    >> 8가지 기본 타입, Array, class, Collection, Interface
 * parameter type >> 8가지 기본 타입, Array, class, Collection, Interface
 * 
 * parameter 개수는 제한이 없다.
 * void print(int a, int b, int c , int d){}
 * >> 정상 print(10,20,30)(x) ,,, print(10, 20, 30, 40)(O)
 * 
 * ex)
 * boolean print(boolean b) {return b};
 * print(false);
 * 
 * 관용적 표현(선배들이 써보았더니 좋았다)
 * 함수의 이름
 * void a(){} ...(X)
 * 의미있는 단어의 조합
 * ex) getChnnelNumber()
 *     getEmpListByEmpno()
 */
public class Fclass {
    public int data;
    public int a;
    public int b;
    
    public String str = new String();
    
    //접근자 생략 >> default void m() {}
    public void m() {
	System.out.println("일반함수 : void, parameter(X)");
    }
    
    public void m2(int i) {
	System.out.println("일반함수: void, parameter(X)");
	System.out.println("일반함수"+ i);
    }
    
    public int m3() {
	return 100;//return type 존재하면 반드시 return 키워드를 사용...
    }
    public int m4(int data) {
	return 100+data;
    }
    public String str(int data) {
	String result = new String();
	result = (data < 50) ? "O" : "X";
	return result;
    }
    //확장
    public int sum(int i, int j, int k) {
	return i + j + k;
    }
    
    //함수 (접근자: public 거의)
    //함수 접근자 private
    //만든 설계자의 의도: 외부에서는 사용 >> 내부에서만 사용 >> 다른 함수를 도와주는 역할
    //내부에서 사용되는 "공통함수" = helper성 함수
    private int subSum(int i) {
	return i + 100;
    }
    
    public void callSubSum() {
	int result = subSum(100);
	System.out.println("call result: " + result);
    }
    public int callSubSum2(int data) {
	int result = subSum(200);
	return result + data;
    }
    private int operationMethod(int date) {
	return data*200;
	
    }
    public boolean opSum(int data) {
	//연산 다른 함수에게 위임
	//본인은 논리 판단
	boolean bo;
	int result = operationMethod(data);
	if(result > 0) {
	    bo = true;
	}else {
	    bo = false;
	}
	return bo;
	
    }
    //Quiz
    //a 와 b 둘중에 큰 값을 return 하는 함수를 만드세요
    //ex) max(300,100) return 갑은 300
    // public int max(int a, int b) {}
    //return을 최소화 해라
    
    public int max(int a, int b) {
	int result = 0;
        if( a > b) {
	    result = a;
	}else {
	    result = b;
	}
	return result;
    }
    
    public int max2(int a, int b) {
	return ( a>b ) ? a : b;
	
    }
    
   //함수의 return type or parameter >> Array, class(사용자 정의 타입)
    public Tv tCall() { // Tv 타입을 갖는 [주소 값: 같은 타입을 갖는 주소]을 return
	//return null; // Tv 타입의 객체가 없다(O)
	
	Tv t = new Tv(); // t 라는 변수는 Tv 타입의 객체가 주소를 가지고 있다.
	t.brand = "LG";
	return t;
	//위 코드는 개발자가 객체에 어떤값을 세팅해서 보낼때
	
	
	//return new Tv(); // Tv라는 객체의 주소값을 바로 return
	//어떠한 초기화도 없이 주소값만 return
    }
    
    public void tcall2(Tv t) { // Tv라는 탑입을 갖는 주소값 파라메타
	System.out.println("t 주소값: " + t);
    }


}
