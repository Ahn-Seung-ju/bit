package Day0202;

//static 변수   >> 모든 객체가 [같은 값]을 가지게 한다
//instance 변수 >> 모든 객체가 [다른 값]을 가지게 한다



class InitTest{
    static int cv = 10;
    static int cv2;
    int iv = 11;
    
    static {// static 블럭(static 초기자 설정 블럭)static 초기자는 static 변수를 초기화하는 역할
	cv = 10; // member field 초기화, 여기서 초기화
	cv2 = cv+222;// 변형된(조작값)0 값을 제공....
    }
    { //instance variable 초기화 블럭
	//new를 통해서 객체가 생성되고 memory에 int iv 변수가 올라가고 나서 바로 호출 >> { }
	System.out.println("초기자 블럭");
	if(iv > 10)iv = 100;
    }
}

public class Ex08_Static_Init {

    public static void main(String[] args) {
	System.out.println(InitTest.cv);
	System.out.println(InitTest.cv2);
	
	
	//일반 자원
	InitTest initTest = new InitTest();
	System.out.println(initTest.iv);

    }

}
