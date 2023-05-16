package uma.sahmyook.function;

public class UmaThread extends Thread{

    private UmaRace ur = new UmaRace();
    private int i;
    private UmaStadium us = new UmaStadium();
    public UmaThread(int num){
        i = num;
    }

    @Override
    public void run(){
        ur.setGame(us.getHorses().get(i));

        //경주마들 경기 설정
        while (!us.isRaceStatus()){
            ur.startUmaRace(us.getHorses().get(i));
            us.checkFinish();
        }
    }
}
