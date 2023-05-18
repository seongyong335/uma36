package uma.sahmyook.horse;

public class GoldShip extends MainHorse {

    public GoldShip(){}
    public GoldShip(String nam) {
        super(nam);
    }

    @Override
    public int calMove() {                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        this.randomSpeed();

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return this.getSpeed();
    }

    //말의 속도를 랜덤값으로 받는 함수 ( 아직 미완성 )
    @Override
    public void randomSpeed() {                              //랜덤으로 스피드 설정

        switch (this.getDistance() / 10){
            case 0 : this.setSpeed((int) ((Math.random() * 10) + 1)); break;
            case 1 : this.setSpeed((int) ((Math.random() * 10) + 1)); break;
            case 2 : this.setSpeed((int) ((Math.random() * 9) + 1)); break;
            case 3 : this.setSpeed((int) ((Math.random() * 8) + 1)); break;
            case 4 : this.setSpeed((int) ((Math.random() * 6) + 1)); break;
            case 5 : this.setSpeed((int) ((Math.random() * 3) + 1)); break;
            default: this.setSpeed((int) ((Math.random() * 3) + 1)); break;
        }
    }
}
