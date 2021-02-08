package Day0205;
//Bird 상속받아서 구현

import kr.or.bit.Bird;

class Bi extends Bird{
    @Override
    protected void moveFast() {
        super.moveFast();
    }
}

class Ostrich extends Bird{
    //구체화 특수화
    void run() {
        System.out.println("run");
        
    }
    @Override
    protected void moveFast() {
        run();
    }
}

public class Ex09_Inherit_Protected {
    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly();
        //point
        //bi.moveFast(); default
        bi.moveFast();
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();
    }

}
