package Day0128;
import kr.or.bit.Apt;
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;
import kr.or.bit.BodyInfo;
public class Ex01_Ref_Type {
    public static void main(String[] args) {
        Emp emp = new Emp();//참조변수(주소값 변수)
        System.out.println(emp);
        //kr.or.bit.Emp@5caf905d
        //kr.or.bit.Emp + @ + 주소
        
        //"." 주소 연산자
        emp.number = -100;
        System.out.println(emp.number);
        
        emp.setNum(-100);
        int result = emp.getNum();
        System.out.println("result:"+result);
        
        
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name: " + name);
        
        
        int num = 100; // 값타입 변수
        System.out.println(num);
        
        //답: 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해서
        Apt sapt = new Apt();
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("주소: " + sapt);
        //kr.or.bit.Apt@8efb846
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("주소: " + lapt);
        //kr.or.bit.Apt@2a84aee7
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("주소: " + mapt);
        //kr.or.bit.Apt@a09ee92
        
        int i = 10;
        int j;
        j = i;
        j = 100;
        //i 값도 100이 되나?
        //값할당
        
        //주소값 할당
        Apt apt = new Apt();
        Apt kapt =apt;
        
        apt.door = 9999;
        System.out.println(kapt.door);
        
        System.out.println("apt: " + apt);
        System.out.println("kapt: " + kapt);
        
        int[] arr = new int[5];
        int[] arr2 = arr; // 주소값 할당
        //같은 주소를 참조 합니다.
        
        //값타입 (8가지)
        //참조타입( Class , Array)
        
        Apt ap; //선언 (stack영역에 공간만 확보 : default 4byte)
        ap = new Apt(); //할당 (ap라는 변수가 메모리를 갔는다)
                        //(객체의 주소값을 갖는다)
        //선언과 할당을 분리할 수 있다.
        System.out.println("ap 주소값 : " + ap);
        ap = null;
        System.out.println("ap 주소값 : " + ap);
        
        //초기화
        Apt ap2;
        ap2 = null;
        System.out.println(ap2);
        
        //함수안에
        Car car;
        car = null;
        System.out.println(car);
        
        Apt ap3 = new Apt();
        System.out.println(ap3.car);
        
        Apt ap4 = new Apt();
        
        Apt ap5 = ap4;
        
        //주소값 비교
        // ==
        
        System.out.println(ap3 == ap4);//비교 ( 변수가 가지고 있는값)
        System.out.println(ap4 == ap5);//true (두 놈은 같은 주소를 가지고 있다)
        
        
        //Tv 한대를 생산하세요
        //제조회사 : 비트
        //체널을 5번 설정
        
        
        Tv bitTv = new Tv();
        bitTv.brand = "비트";
        bitTv.ch_Up();
        bitTv.ch_Up();
        bitTv.ch_Up();
        bitTv.ch_Up();
        bitTv.ch_Up();
        
        bitTv.tv_Info();
        
        //사원 1명을 생성
        //사번: 7788, 이름 : 김유신 , 부서 : IT , 급여 1000
        //신체정보는 키는 190 , 몸무게 40
        
        Person person = new Person();// 컨트롤 시프트 O 자동완성
        
        person.empo = 7788;
        person.ename = "김유신";
        person.job = "IT";
        person.sal = 1000;
        
        //방법 1
        //person.bodyInfo = new BodyInfo();
        //person.bodyInfo.height = 190;
        //person.bodyInfo.weight = 40;
        
        
        //방법 2
        BodyInfo info = new BodyInfo();
        info.height = 190;
        info.weight = 40;
        person.bodyInfo = info;
        
        System.out.printf("%d %d", info.height, info.weight );
                
    }

}
