package uma.sahmyook.horse;

public class NiceNature extends MainHorse {
    private int nn = 0;
    public NiceNature() {
    }

    public NiceNature(String nam) {
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

        nn = ((int) ((Math.random() * 11) + 3) % 3) ;
        switch (nn){
            case 1 : this.setSpeed(1+2); break;
            case 2 : this.setSpeed(1+2+3); break;
            case 3 : this.setSpeed(1+2+3+3); break;
            default: this.setSpeed(1+2);
        }

    }
}
