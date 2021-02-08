package kr.or.bit;
/*Tv 설계도 요구사항정의
 * Tv는 채널 정보를 가지고 있다 (예를들면 1~200 값을 가질 수 있다)
 * 는 브랜드 이름을 가지고 있다
 * 채널 전환 기능을 가지고 있다
 * ->채널 증가 시키는 기능
 * ->채널 감소 시키는 기능
 */
public class Tv {
    
    public int ch; //default = 0;
    
    public String brand; //default = null;
    
    public void ch_Up() {
        ch++;
    }
    
    public void ch_Down() {
        ch--;
    }
    //채널정보, 브랜드 이름 출력 기능
    public void tv_Info() {
        System.out.printf("[%s] , [%d] \n", brand, ch);
    }

}
