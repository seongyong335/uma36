package uma.sahmyook.horse;

public class Horse3 extends MainHorse implements HorseInterface2{
//처음에 스태피너 써서 속도 증가

    public Horse3() {
    }

    public Horse3(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정

        setUmaName(nam);
        setRaceProgress(nam);
    }
    @Override
    public void booster() {

        setStamina(80);
        setSpeed(getSpeed()*3);
        System.out.println("부스터를 사용했습니다.");
    }

    @Override
    public int calMove(){
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
