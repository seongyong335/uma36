package uma.sahmyook.score;
import uma.sahmyook.*;
import uma.sahmyook.menu.MainMenu;

public class BettingScore {

    //경기 종료 후 선택한 말 초기화, 1등 우승시 스코어 증가
    //
    public static void bettingResult(){ // 선택한 말이 1등 할 시 마권 수 만큼 배당률에 계산해서 보유 스코어 + 베팅 스코어
       // 선택말이 int rank = 1 이 맞을 경우 현재 스코어 + (ticket * 배당률)을 한다. 그 후에 roundreset
        if (MainMenu.horseNum == 1/* 임시 if " 선택말이 1등일 경우*/){
            System.out.println("(말 이름)"+"! 훌륭히 완승!! 레이스를 제패합니다!.");
            MainMenu.score += (MainMenu.ticket * 1000);
        }
        else {
            System.out.println("(말 이름)" +"이(가) 제패에 실패했습니다.");

        }


    }



}
