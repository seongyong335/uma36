package uma.sahmyook.function;

import static uma.sahmyook.Application.us;
public class UmaThread extends Thread{

    private UmaRace ur = new UmaRace();
    private int i;
    public UmaThread(int num){
        i = num;
    }       //생성할때 int를 받는다

    @Override
    public void run(){

        ur.setGame(us.getHorses().get(i));      //말 설정

        do{
            us.checkFinish();
            ur.startUmaRace(us.getHorses().get(i));
        } while (!us.isRaceStatus());
    }
}
