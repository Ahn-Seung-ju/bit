package kr.or.bit;
//디자인 패턴(생성 패턴) >> new (객체)관련 패턴
//객체 하나를 만들어 공유
//의도: 하나의 객체를 만들어 공유하겠다

//활용
//공유 프린터
//와이파이

//singleton은 하나의 객체를 바라보게 한다.
public class Singleton {
    private static Singleton p;
    private Singleton() {//private
        //의도: 직접 객체 생성 불가...new(x)...heap 객체 생성 불가(생성자를 통해서)
        
    }
    public static Singleton getInstance() {
        if(p == null) {
            p= new Singleton();//생성자 호출 객체 만든 것
        }
        return p;
    }

}
