package uma.sahmyook;


import uma.sahmyook.menu.MainMenu;
import uma.sahmyook.function.*;
import uma.sahmyook.horse.*;

public class Application {

    public static void main(String[] args) {

        MainMenu menu = new MainMenu();
        menu.mainMenu();
            /* 경기 생성 및 시작 */
            UmaRace ur = new UmaRace();
            ur.startGame();
    }
}
