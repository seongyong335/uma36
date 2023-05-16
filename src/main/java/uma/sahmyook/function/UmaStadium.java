package uma.sahmyook.function;

import uma.sahmyook.horse.*;

import java.util.ArrayList;
import java.util.List;

public class UmaStadium {
    static List <MainHorse> horses = new ArrayList<>();
    private boolean raceStatus;
    private int umaCount = 4;
    public UmaStadium() {
        horses.add(new MainHorse("a"));
        horses.add(new MainHorse("b"));
        horses.add(new MainHorse("c"));
        horses.add(new MainHorse("d"));
    }

    public List<MainHorse> getHorses() {
        return horses;
    }

    public void checkFinish(){
       if(horses.get(0).isFinish() && horses.get(1).isFinish() && horses.get(2).isFinish() && horses.get(3).isFinish()){
           this.setRaceStatus(true);
       }
    }

    public void checkRank(){
        for(int i = 1; i <= umaCount; i++){                                                            //경주마 수만큼 결과 출력
            if(i == horses.get(0).getRank()){                                                                 //경주마 등수 높은 순으로 출력
                System.out.println(horses.get(0).getUmaName() + "가 " + horses.get(0).getRank() + "등을 차지했습니다!");
            } else if(i == horses.get(1).getRank()){
                System.out.println(horses.get(1).getUmaName() + "가 " + horses.get(1).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(2).getRank()){
                System.out.println(horses.get(2).getUmaName() + "가 " + horses.get(2).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(3).getRank()){
                System.out.println(horses.get(3).getUmaName() + "가 " + horses.get(3).getRank() + "등을 차지했습니다!");
            }
        }
    }

    public boolean isRaceStatus() {
        return raceStatus;
    }

    public void setRaceStatus(boolean raceStatus) {
        this.raceStatus = raceStatus;
    }
}
