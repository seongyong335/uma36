package uma.sahmyook;
import uma.sahmyook.horse.*;


import uma.sahmyook.function.UmaRace;

public class Application {

    public static void main(String[] args) {

        /* 경기 생성 및 시작 */
        UmaRace ur = new UmaRace();
        ur.startGame();
    }
}
