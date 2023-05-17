package uma.sahmyook.function;

import uma.sahmyook.horse.MainHorse;

import java.util.ArrayList;
import java.util.List;

public class UmaStadium {
    static List <MainHorse> horses = new ArrayList<>();
    private boolean raceStatus;
    private int umaCount = 9;       //출전말 갯다
    private int tmpTurn = 0;
    public UmaStadium() {
        //출전 말 등록
        horses.add(new MainHorse("a"));
        horses.add(new MainHorse("b"));
        horses.add(new MainHorse("c"));
        horses.add(new MainHorse("d"));
        horses.add(new MainHorse("e"));
        horses.add(new MainHorse("f"));
        horses.add(new MainHorse("g"));
        horses.add(new MainHorse("h"));
        horses.add(new MainHorse("i"));
    }

    public List<MainHorse> getHorses() {
        return horses;
    }

    public void clear(){
        for(int i = 0; i < umaCount; i++){
            tmpTurn += horses.get(i).getTurn();
        }
        if(tmpTurn % 9 == 0){
            for(int j = 0; j < 10; j++){
                System.out.println();
            }
        }
    }

    public void checkFinish(){      //끝난거 체크
       if(horses.get(0).isFinish() && horses.get(1).isFinish() && horses.get(2).isFinish() && horses.get(3).isFinish() && horses.get(4).isFinish() && horses.get(5).isFinish() && horses.get(6).isFinish() && horses.get(7).isFinish() && horses.get(8).isFinish()){
           this.setRaceStatus(true);
       }
    }

    public void checkRank(){        //랭킹 체크
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
            else if(i == horses.get(4).getRank()){
                System.out.println(horses.get(4).getUmaName() + "가 " + horses.get(4).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(5).getRank()){
                System.out.println(horses.get(5).getUmaName() + "가 " + horses.get(5).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(6).getRank()){
                System.out.println(horses.get(6).getUmaName() + "가 " + horses.get(6).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(7).getRank()){
                System.out.println(horses.get(7).getUmaName() + "가 " + horses.get(7).getRank() + "등을 차지했습니다!");
            }
            else if(i == horses.get(8).getRank()){
                System.out.println(horses.get(8).getUmaName() + "가 " + horses.get(8).getRank() + "등을 차지했습니다!");
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
