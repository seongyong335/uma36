package uma.sahmyook.horse;

public class Horse7 extends MainHorse{
//stamina가 70일 때 한턴 쉼, 대신 속도값 조정 가능 ( 다른말보다 조금 빠르게 )

    public Horse7() {
    }

    public Horse7(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정

        setUmaName(nam);
        setRaceProgress(nam);
    }

    @Override
    public int calMove(){
        randomSpeed();
        useStamina();
        if(getStamina() == 70){
            setSpeed(0);
            return 0;
        }

        if(getStamina()<50){
            setSpeed(getSpeed()/2);
        }

        return getSpeed();
    }





}
