package Day0205;
/*
Tip) c# 다형성(overloading, override)

Java: [상속관계]에서 하나의 참조변수가 여러개의 타입을 가질 수 있다.
[한의 참조변수] >> 부모타입

부모클래스 타입의 참조변수가 여러개의 자식클래스 객체를 담을 수 있다.
 */

class Tv2{
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}
class CapTv extends Tv2{// 자막이 있는 Tv
    //특수화, 구체화된 자원은 >> 자막 기능
    String text;
    String captionText() {
        return this.text = "현재 자막 처리중...";
    }
}
public class Ex10_Inherit_Poly {
    public static void main(String[] args) {
        CapTv captv = new CapTv();
        captv.power();
        System.out.println("전원: "+ captv.power);
        
        captv.chUp();
        System.out.println("채널: " + captv.ch);
        System.out.println(captv.captionText());
        //기존 배운 내용
        
        //Car c = new Car();
        //Car c2 = c;
        
        Tv2 tv2 = captv;
        
        //상속관계에서 [부모 타입]은 [자식 타입]의 주소를 가질 수 있다.(다형성)
        //단 부모는 자신의 자원만 접근
        //단 재정의를 제외하면
        
        System.out.println(tv2.toString());
        System.out.println(captv.toString());
        
        //tv2.captionText()
        //자식의 것은 접근 불가
        tv2.power();//내것은 접근 가능
    }

}
