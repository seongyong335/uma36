package uma.sahmyook.score;

import com.sun.tools.javac.Main;
import uma.sahmyook.horse.MainHorse;
import uma.sahmyook.menu.MainMenu;

import static uma.sahmyook.menu.MainMenu.us;

public class BettingScore {

    //경기 종료 후 선택한 말 초기화, 1등 우승시 스코어 증가
    //

    public void bettingResult(){
        if (us.getHorses().get(MainMenu.horseNum-1).getRank() == 1){
            System.out.println(us.getHorses().get(MainMenu.horseNum-1).getUmaName()+"!!! 훌륭히 완승!! 레이스를 제패합니다!.");
//            MainMenu.score += (1000 * MainMenu.ticket * us.getHorses().get(MainMenu.horseNum-1).calDividend());
            MainMenu.score += 10040;
        } /*else if*("마권 0장이면 암것도 안뜨게")*/
        else {
            System.out.println("(말 이름)" +"이(가) 제패에 실패했습니다.");

        }


    }



}
