package Day0129;

class Human{
    String name;
}

class Test{
    int add(int i, int j) {
	return i + j;
    }
    //배열은 객체다(배열은 주소값을 가지고 있다: heap의 생성)
    int[] add2(int[] param) { // int 배열의 주소값을 리턴값을 리턴, int[] 배열의 주소값을 갖겠다.)
	//return null;
	//return new int[5]; // return new Tv();
	int[] arr = new int[param.length];
	for(int i = 0; i < arr.length; i++) {
	    arr[i] = param[i]+1;
	}
	return arr;
    }
    
    int[] add3(int[] so, int[] so2) {
	
	int[] arr = new int[so.length];
	
	
	for(int i = 0; i <arr.length; i++) {
	    int result = (so[i] > so2[i]) ? so[i] : so2[i];
	    
	    arr[i] = result;
	}
	
	
	
	
	return arr;
    }
    //코드 작성
    //main 에서 작성
}



public class Ex_MethodCall_Array {
    public static void main(String[] args) {
	Test t = new Test();
	int result = t.add(10,10);
	System.out.println("result: " + result);
	
	
	
	
	int[] array = {10,20,30};
	int[] resultArray = t.add2(array);
	for(int i : resultArray) {
	    System.out.println("i: " + i);
	}
	
	//add3() error없이..
	
	int[] array2 = {10,20,30};
	int[] array3 = {15,19,99};
	int[] resultArray2 = t.add3(array2, array3);
	for(int i : resultArray2) {
	    System.out.println("i: " + i);
	}
    }
    

}
