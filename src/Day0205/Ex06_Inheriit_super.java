package Day0205;
/*
this: 객체가 자신을 가르키는 This(this.empno, this.ename)
this: 


상속

부모

자식(this)

super(현재 자식이 부모의 접근 주소값): 상속관계에서 부모에 접근
자식입장에서 super 부모의 객체의 주소

1. super >> [상속관계]에서 자식이 부모의 접근
2. super >> [상속관계]에서 부모의 생성자를 호출(명시적으로)

Tip)
c# >> base()
java >> super()
 */

class Base {
    String basename;

    Base() {
        System.out.println("Base 기본 생성자 함수");
    }

    Base(String basename) {
        this.basename = basename;
        System.out.println("basename: " + this.basename);
    }

    void method() {
        System.out.println("나 부모 method");
    }
}

class Derived extends Base {
    String dname;

    Derived() {
        System.out.println("Derived 기본 생성자 함수");
    }

    Derived(String dname) {

        super(dname);// 부모 생성자를 호출(상속관계)
        this.dname = dname;
        System.out.println("dname: " + this.dname);
    }

    @Override
    void method() {
        // super.method();
        System.out.println("부모함수 재정의");
    }
    //재정의된 함수 말고 본래 함수를 호출방법
    //유일한 방법 super
    
    void parent_method() {
        super.method();
    }

}

public class Ex06_Inheriit_super {
    public static void main(String[] args) {
        // Derived d = new Derived();
        Derived d = new Derived("홍길동");
        d.method(); 
        d.parent_method();
    }

}
