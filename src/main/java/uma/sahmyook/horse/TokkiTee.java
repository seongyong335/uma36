package uma.sahmyook.horse;

public class TokkiTee extends MainHorse implements HorseInterface1 {

    /* super클래스에서는 스테미너가 50미만이면 속도가 반으로 감소하지만 Horse1은 스테미너로 인한
    * 속도 감소 없음 */

    public TokkiTee(){}                                           // 기본생성자

    public TokkiTee(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }                   // 말이 이름을 매개변수로 받는 생성자

    @Override
    public void resetStamina() {                                // 스테미너 값을 100으로 설정하는 메소드
         setStamina(130);
    }

    @Override
    public void useStamina(){                                   // 스테미너가 50이하가 되면 다시 100으로 돌리는 메소드를 실행하는 메소드
        setStamina(getStamina()-10);
        if(getStamina()<=100) resetStamina();
    }
    @Override
    public int calMove(){                        // 속도를 리턴받는 메소드
        randomSpeed();
        useStamina();

        if(getStamina()<=70){    //스태미너가 100 이하로 떨어지면 스피드 감소
            setSpeed(getSpeed()*2);
        }

        return getSpeed();
    }

}