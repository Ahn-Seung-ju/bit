package Day0202;

/*
OOP (객체 지향 프로그램) >> 설계도 만들기
1. 상속(재사용성)
2. 캡슐화(은닉화): private (직접할당, 간접할당) >> getter, setter
3. 다형성: 하나의 타입으로 여러개의 객체 주소를 갖는 것

>> method overloading
>> 하나의 이름으로 여러가지 기능을 하는 함수
System.out.println() >> println() 이름은 1개 기능은 여러개
1. 성능향상과 상관없다
2. 설계자가 개발자의 편리성을 위해서 제공(편하게 쓰기위하여)

문법) 함수의 이름은 같고 parameter [개수] 와 [타입]을 다르게 만들면 overloading으로 인정

1. 함수의 이름은 같아야 한다
2. parameter 개수 또는 타입은 달라야 한다
3. return type 오버로딩의 판단 기준이 아니다
4. parameter 순사가 다름을 인정(주의)


class out{
   public void println() {}
   public void println(int i) {}
   public void println(String s) {}
   ...100개

}

overriding
상속에서 재정의하는 것

 */

class Human {
    String name;
    int age;
}

class OverTest {
    int add(int i) {
	return 100 + i;
    }

    int add(int i, int j) {
	return i + j;
	// 오버로딩 인정
    }

    // String add(int j) { 충돌 (X)
    // return "";
    // }

    String add(String s) {
	return "hello";
    }

    String add(String s, int i) { // overloading 인정
	return null;
    }

    String add(int i, String s) { // 순서가 달라도 overloading 인정
	return null;
    }

    void add(Human human) {
	human.name = "홍길동";
	human.age = 100;
	System.out.println(human.name + " , " + human.age);
    }
    // Human add(Human h) { parameter 개수가 같고 타입이 같다.

    // }
}



public class Ex14_Method_Overloading {

    public static void main(String[] args) {
	OverTest ot = new OverTest();
	ot.add(100, 200);

	ot.add(new Human());

	String result = ot.add("하이");
	System.out.println(result);

    }

}
