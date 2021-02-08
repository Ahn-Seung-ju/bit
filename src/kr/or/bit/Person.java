package kr.or.bit;
/*
 * 사원은 사번을 가지고 있고 숫자데이터로 관리
 * 사원은 이름을 가지고 있고 문자열 데이터로 관리
 * 사원은 급여를 숫자 데이터로 관리 된다
 * 사원은 신체정보를 가지고 있다 키와 몸무게 데이터로 관리.
 * >> 부품정보 >> 신체정보 >> 하나의 타입 >> 사용자(개발자) >> class
 */

public class Person { //사원 클래
    
    public int empo;
    public String ename;
    public String job;
    public int sal;
    
   
    public BodyInfo bodyInfo; //default null
    
    

}
