package uma.sahmyook.function;

import static uma.sahmyook.menu.MainMenu.us;

public class ClearThread extends Thread{

    public void run(){
        while (!us.isRaceStatus()){
            us.clear();
            try {
                Thread.sleep(1000);                                                //게임 속도 조절
            } catch (Exception e) {
            }
        }
    }
}
