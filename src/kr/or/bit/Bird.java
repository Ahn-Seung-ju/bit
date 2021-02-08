package kr.or.bit;

//새(공통(일반,추상)) >> 새는 날수 있다. 새는 빠르다

public class Bird {
    //공통기능
    public void fly() {
        System.out.println("flying");
        
    }
    //관계자
    //나를 상속하는 당신은 moveFast를 필요에 따라서 재정의 의지 담김(80%) >> 상속관계
    
    protected void moveFast() {
        fly();
    }

}
