package uma.sahmyook.score;

import uma.sahmyook.menu.MainMenu;

public class Round {
    public static void roundReset(){ /*경기 종료 후 선택 말, 티켓 초기화*/
        MainMenu.ticket = 0;
        MainMenu.horseNum = 0;

    }

}
