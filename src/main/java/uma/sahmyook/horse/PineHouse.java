package uma.sahmyook.horse;

public class PineHouse extends MainHorse implements HorseInterface2 {

    public PineHouse() {
    }

    public PineHouse(String name) {
        super(name);
    }

    @Override
    public void booster() {
        setStamina(100);
        setSpeed(getSpeed() * 3);
    }

    @Override
    public int calMove() {
        randomSpeed();
        if (getStamina() <= 40) {
            booster();
        }
        useStamina();

        if (getStamina() <= 20) {
            setSpeed(getSpeed() / 2);
        }
//        getStamina가 50 이상이고 getSpeed가 10 이상인 경우에 이 조건에 해당하는 말은 속도를 20 증가시킵니다.

        // 체력과 속도에 따라 능력을 향상시킵니다
        if (getStamina() >= 80 && getSpeed() >= 10) {
            setSpeed(getSpeed() + 50);

        }

        return getSpeed();
    }
}