package kr.or.bit;
// 창문의 수
// 속도
// 2가지 속성 캡슐화
// 속도는 마이너스 값이 오면 0으로 초기화


//기능 속도를 10씩 올리거나 감소하는 기능
//    속도가 마이너스 값을 가지면 0으로 초기화

public class Car {
    
    private int windows;
    private int speed;
    
    public int getWidows() {
        return windows;
    }
    public void setWinows(int windows) {
        this.windows = windows;
    }
    
    
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed <= 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
            
        
    }
    
    public void speedUp() {
        this.speed += 10;
    }
    public void speedDown() {
        if(this.speed > 0) {
            this.speed -= 10;
        }else {
            this.speed = 0;
        }
        
    }
    
    public void carInfo() {
        System.out.printf("windows: %d speed: %d\n", windows, speed);
    }
    

}
