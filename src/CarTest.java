public class CarTest {
    public static void main(String[] args){
        Car bmw = new Car("Model 3","빨강"); // Car 클래스로 만들어진 bmw 인스턴스
        System.out.println("내 차의 모델은 "+bmw.model+"이고 색은"+bmw.color+"이고 문 개수는"+ Car.doors +"입니다");
        bmw.start();     // static 으로 선언된 doors는 객체명이 아닌 클래스명을 앞에 붙여 Car.doors로 불러온다.
        bmw.accelerate();
        bmw.stop();
    }
}
class Car{  // 속성3개= 모델,색상,문 기능3개, 이것들은 다 멤버
    String model; // 인스턴스변수 : 객체 생성 해야만 불러올 수 있다.
    String color;
    static int doors = 4;  // 클래스변수 : 객체 생성 안해도 Car.doors 로 불러올 수 있다.

    public Car(String model, String color){ //인스턴스 초기화 생성자함수
        this.model = model;
        this.color = color;

    }
    void start(){
        System.out.println("시동을 걸어습니다. 부릉루~");
    }
    void accelerate(){
        System.out.println("속도 업!");
    }
    void stop(){ System.out.println("멈춤");
    }
}
