package Day0203;

/*
원칙: 생성자는 객체 생성시 1개만 호출(Car c = new Car() or Car c = new Car(100))
예외적으로
this 활용하면 여러개의 생성자를 호출할 수 있다.


 */
//아래코드는 중보이 보임
//값을 할당하는 부분 중복적으로 보임 ... 할당하는 부분을 1개로 표현
/*
class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar(){
        this.color = "red";
        this.geartype = "Stick";
        this.door = 2;
    }
    Zcar(String color, String geartype, int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    void print() {
        System.out.println(this.door + this.geartype + this.door);
    }
}
*/
class Zcar {
    
    String color;
    String geartype;
    int door;

    Zcar() {
        // 생성자를 호출하는 this...
        this("red", "stick", 2); // 다시 호출 // parameter 3개 호출
        System.out.println("default constructor");
    }

    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
    }

    void print() {
        System.out.println(this.color + ","+ this.geartype +"," + this.door);
    }
}

class Zcar2 {
    String color;
    String geartype;
    int door;
    
    Zcar2(){
        this("red",1);
        System.out.println("default constructor");
    }
    Zcar2(String color, int door){
        this(color, door, "auto");
        System.out.println("overloading constructor param 2개");
        
    }
    Zcar2(String color, int door,String geartype){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor param 3개");
    }
    void print() {
        System.out.println(this.color+this.door+this.geartype);
    }
    
}

public class Ex20_this {

    public static void main(String[] args) {
        //Zcar zcar = new Zcar();
        //zcar.print();
        
        
        Zcar2 zcar = new Zcar2();
        
        //Zcar2 zcar2 = new Zcar2("gold", 2);
        
        //Zcar2 zcar3 = new Zcar2("gold", 2, "Stick");
        
        zcar.print();
        

    }

}
