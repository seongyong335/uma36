package uma.sahmyook.horse;

public class Horse1 extends MainHorse implements HorseInterface1{
            /* 체크해보려고 만들어본 말객체입니다. 상속받을 말 클래스 완성 후 조정 할 수 있음. 아니면 머지할 떄 머지 안해도됩니다.  */
    @Override
    public int resetStamina() {
        return stamina = 100;
    }

    @Override
    public void useStamina(){           //원래는 스테미너 50이하일때는
        stamina = stamina - 10;
        if(stamina<=50) resetStamina();
    }

    @Override
    public int calMove(){                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        randomSpeed();
        useStamina();                                   // 달린후 스태미너를 사용합니다.

        if(stamina<=50){                                 //스테미너가 50이하로 떨어지면 스피드가 반으로 줄어든다.
            setSpeed(getSpeed()/2);
        }

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return getSpeed();
    }


}
