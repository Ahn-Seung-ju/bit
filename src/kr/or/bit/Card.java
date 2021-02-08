package kr.or.bit;
/*
우리는 카드를 판매하는 회사
고객 요청 53장을 제작
요구사항
카드는 번호 모양을 가짐
카드는 크기 높이와 너비
카드 카드는 h = 50 w = 20

[모든 카드의 높이 너비 동일]
?? 카드의 크기를 나중에 변경하면??
설계도를 다시 변경하지 않고 53카드의 크기를 변경할 수 없을까?
 */

public class Card {
    public int number;// default
    public String kind;

    // public int h = 40;//초기화
    // public int w = 20;

    public static int h = 50;
    public static int w = 30;

    public void carInfo() {
	System.out.printf("번호: %d , 모양: %s , h: %d , w: %d \n", number, kind, h, w);
    }

}
