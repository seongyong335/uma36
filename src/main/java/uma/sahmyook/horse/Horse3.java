package uma.sahmyook.horse;

public class Horse3 extends MainHorse implements HorseInterface2{
//처음에 스태피너 써서 속도 증가

    public Horse3() {                                       // 기본생성자
    }

    public Horse3(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }               // 말의 이름을 매개변수로 받는 생성자
    @Override
    public void booster() {                                 // 스테미너를 80으로 바꾸고 속도를 3배로 설정하는 메소드
        setStamina(80);
        setSpeed(getSpeed() * 3);
    }
    @Override
    public int calMove(){                                  // 속도를 리턴받는 메소드
        randomSpeed();
        if(getStamina()==100) {
            booster();

        }
        useStamina();

        if(getStamina() <= 50){
            setSpeed(getSpeed()/2);
        }

        return getSpeed();
    }

}
