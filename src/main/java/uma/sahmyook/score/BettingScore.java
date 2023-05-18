package uma.sahmyook.score;

import uma.sahmyook.menu.MainMenu;

import static uma.sahmyook.menu.MainMenu.us;

public class BettingScore {

    public void bettingResult(){
        if (us.getHorses().get(MainMenu.horseNum-1).getRank() == 1){ /* 선택한 말이 1등을 할 경우 출력*/
            System.out.print(us.getHorses().get(MainMenu.horseNum-1).getUmaName()+"!!! 훌륭히 완승!! 레이스를 제패합니다! ");
            MainMenu.score += (1000 * MainMenu.ticket * us.getHorses().get(MainMenu.horseNum-1).getDividendRate());
        } else if(MainMenu.ticket == 0){ /*티켓 없이 경기 종료 후*/
            System.out.print("경기 종료! ");
        }
        else { /*선택한 말이 1등을 실패할 경우*/
            System.out.print(us.getHorses().get(MainMenu.horseNum-1).getUmaName()+"이(가) 제패에 실패했습니다. ");
        }
    }
}
