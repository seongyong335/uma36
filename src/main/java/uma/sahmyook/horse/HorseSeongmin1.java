package uma.sahmyook.horse;

public class HorseSeongmin1 extends MainHorse {
//기본말

    public HorseSeongmin1() {} // 기본 생성자

    public HorseSeongmin1(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    } // 말 이름 받는 생성자

    public int resetStamina() {
        return setStamina(90);
    } // 스태미나를 90으로 리셋해주는 메소드

    public void randomEvent(){  // (int) (Math.random()*10) 이 2보다 작을때 (20퍼의확률) 스피드 2배로 증가
        if((int) (Math.random()*10)  <= 2 ){
            setSpeed(getSpeed() * 2);
        }
    }
    @Override
    public void useStamina() {           // 스태미너 10씩 감소, 20보다 같거나 작아지면 스태미너 90으로 리셋
        setStamina(getStamina() - 10);
        if (getStamina() <= 20) resetStamina();
    }

    @Override
    public void randomSpeed() {
        setSpeed((int) ((Math.random() * 9) + 1) * (int) ((Math.random() * 9) + 1));
    }

    @Override
    public int calMove() {                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        randomSpeed();
        useStamina();                                   // 달린후 스태미너를 사용합니다.
        randomEvent();
        if (getStamina() <= 40) {                                 //스테미너가 40이하로 떨어지면 스피드가 반으로 줄어든다.
            setSpeed(getSpeed() / 2);
        }
        return getSpeed();
    }
}
