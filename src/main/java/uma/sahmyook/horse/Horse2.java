package uma.sahmyook.horse;

public class Horse2 extends MainHorse {

    public Horse2() {                                               // 기본생성자
    }
    public Horse2(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }                       // 말의 이름을 매개변수로 받는 생성자
    @Override
    public void useStamina() {                                      // 스테미너각 3만큼 감소시키는 메소드
        setStamina(getStamina() - 3);
    }
    @Override
    public int calMove() {                          // 속도를 리턴받는 메소드
        randomSpeed();
        useStamina();

        if (getStamina() <= 50) {
            setSpeed(getSpeed() / 2);
        }

        return getSpeed();
    }
}



