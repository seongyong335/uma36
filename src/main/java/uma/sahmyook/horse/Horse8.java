package uma.sahmyook.horse;

public class Horse8 extends MainHorse{
//초반엔 빠르다가 나중엔 다른 말과 같은 랜덤속도를 가지는 말
    public Horse8() {
    }

    public Horse8(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }

    @Override
    public int calMove() {                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        randomSpeed();
        useStamina();
        if(getStamina()<100 && getStamina()>50){
            setSpeed(getSpeed()*2);
        }

        if (getStamina() <= 50) {                                 //스테미너가 50이하로 떨어지면 스피드가 반으로 줄어든다.
            setSpeed(getSpeed() / 2);
        }

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return getSpeed();
    }



}
