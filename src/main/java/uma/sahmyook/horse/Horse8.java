package uma.sahmyook.horse;

public class Horse8 extends MainHorse{
//초반엔 빠르다가 나중엔 다른 말과 같은 랜덤속도를 가지는 말
    public Horse8() {}                                                        // 기본 생성자

    public Horse8(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }                                 // 말의 이름을 매개변수로 받는 생성자

    @Override
    public int calMove() {                                   // 말의 속도를 리턴받는 메소드
        randomSpeed();
        useStamina();
        if(getStamina()<100 && getStamina()>50){
            setSpeed(getSpeed()*2);
        }

        if (getStamina() <= 50) {
            setSpeed(getSpeed() / 2);
        }

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return getSpeed();
    }



}
