package Day0202;

import kr.or.bit.Card;

public class Ex07_Static_cardMake {

    public static void main(String[] args) {
	//Card 53장
	//heap memory(객체)
	Card c = new Card();
	c.number =1;
	c.kind = "heart";
	c.h = 80;
	c.w= 50;
	c.carInfo();
	
	Card c2 = new Card();
	c2.number =2;
	c2.kind = "heart";
	c2.carInfo();
	
	//고객 카드가 작다
	//현실세계 53 인쇄
	
	//h=80 w=50 요구사항
	//프로그램 세계
	//1. 53장 카드 h, w 일일이 변경
	
	//2. 설계도 변경(다시 인쇄)
	
	Card c3 = new Card();
	c3.number =3;
	c3.kind = "heart";
	//c3.h = 50;
	//c3.w = 80;
	c3.carInfo();

    }

}
