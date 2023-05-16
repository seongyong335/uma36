package uma.sahmyook.function;

public class UmaThread extends Thread{

    private UmaRace ur = new UmaRace();
    private int i;
    private UmaStadium us = new UmaStadium();
    public UmaThread(int num){
        i = num;
    }       //생성할때 int를 받는다

    @Override
    public void run(){

        ur.setGame(us.getHorses().get(i));      //말 설정

        //경주마들 경기 설정
        while (!us.isRaceStatus()){
            ur.startUmaRace(us.getHorses().get(i));
            us.checkFinish();
        }
    }
}
