package uma.sahmyook.horse;

public class RabbitPrincess4 extends MainHorse implements HorseInterface2 {
//처음에 스태피너 써서 속도 증가

    public RabbitPrincess4() {                                       // 기본생성자
    }

    public RabbitPrincess4(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }               // 말의 이름을 매개변수로 받는 생성자
    @Override
    public void booster() {                                 // 스테미너를 60으로 바꾸고 속도를 5배로 설정하는 메소드
        setStamina(60);
        setSpeed(getSpeed() * 3);
    }
    @Override
    public int calMove(){                                  // 속도를 리턴받는 메소드
        randomSpeed();
        if(getStamina()==70) {
            booster();

        }
        useStamina();

        if(getStamina() <= 30){
            setSpeed(getSpeed()/2);
            setStamina(getStamina()+20);
        }

        return getSpeed();
    }

}