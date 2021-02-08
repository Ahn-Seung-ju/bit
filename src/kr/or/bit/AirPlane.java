package kr.or.bit;
/*
 * 요구사항
 * 1. 비행기 생산 이름 번호
 * 2. 비행기 생산 이름 번호 확인 작업
 * 3. 총대수
 * 
 * 
 */


public class AirPlane {
    private int airnum;
    private String airname;
    private static int airtotalcount;
    
    public AirPlane(int airnum , String ariname) {
    
        this.airnum = airnum;
        this.airname = ariname;
        //강제 누적
        airtotalcount++;
        
        
    }
    public void AirPlaneInfo() {
        System.out.println("비행기이름: " + this.airname + " , 비행기번호: " + this.airnum);
    }
    public void airPlaneTotalCount() {
        System.out.printf("비행기 누적대수: [%d]\n", airtotalcount);
    }
    
    
    public int getAirnum() {
        return airnum;
    }
    public String getAirname() {
        return airname;
    }
    

}
