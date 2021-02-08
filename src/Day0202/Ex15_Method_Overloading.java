package Day0202;
class Human3{
    String name;
    int age;
    
}

class Test2{
    Human3 add(Human3 h) {
	h.name = "안승주";
	h.age = 27;
	
	System.out.println(h.name + "  "+ h.age);
	
	return h;
	
    }
    
    Human3 add(Human3 h, Human3 h2) {
	h2.name = h.name;
	h2.age = h.age + 3;
	
	System.out.println(h2.name + "  "+ h2.age);
	return h2;
    }
}

public class Ex15_Method_Overloading {

    public static void main(String[] args) {
	Test2 t2 = new Test2();
	Human3 h = new Human3();
	Human3 e = new Human3();
	t2.add(h);
	
	t2.add(h, e);

    }

}
