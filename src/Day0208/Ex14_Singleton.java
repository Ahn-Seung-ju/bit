package Day0208;

import kr.or.bit.Singleton;

public class Ex14_Singleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
        
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }

}
