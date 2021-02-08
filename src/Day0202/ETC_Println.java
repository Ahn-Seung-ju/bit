package Day0202;
//System.out.println() 원리 코드
class print{
    void add(int i) {System.out.println(i);}
    void add(String s) {System.out.println(s);}
}

class Ssystem{
    public static final print out;//상수라는건 값을 보장해야 한다.
    static {
	out = new print();
	
    }
}

public class ETC_Println {
    public static void main(String[] args) {
	Ssystem.out.add(100);
    }

}
