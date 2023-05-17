package uma.sahmyook.horse;

public class Horse1 extends MainHorse implements HorseInterface1 {

    /* super클래스에서는 스테미너가 50미만이면 속도가 반으로 감소하지만 Horse1은 스테미너로 인한
    * 속도 감소 없음 */


    public Horse1(){}

    public Horse1(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정

        this.setUmaName(nam);
    }

    @Override
    public int resetStamina() {
        return setStamina(100);
    }

    @Override
    public void useStamina(){           //원래는 스테미너 50이하일때는
        setStamina(getStamina()-10);
        if(getStamina()<=50) resetStamina();
    }

    @Override
    public int calMove(){                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        randomSpeed();
        useStamina();                                   // 달린후 스태미너를 사용합니다.

        if(getStamina()<=50){                                 //스테미너가 50이하로 떨어지면 스피드가 반으로 줄어든다.
            setSpeed(getSpeed()/2);
        }

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return getSpeed();
    }




}
