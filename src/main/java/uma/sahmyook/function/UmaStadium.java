package uma.sahmyook.function;

import uma.sahmyook.horse.*;

import java.util.ArrayList;
import java.util.List;

public class UmaStadium {
    static List <MainHorse> horses = new ArrayList<>();
    private boolean raceStatus;
    private int umaCount = 9;       //출전말 갯다
    private int tmpTurn = 0;
    public UmaStadium() {
        //출전 말 등록
        horses.add(new HorseSeongmin1("S1"));
        horses.add(new HorseSeongmin2("S2"));
        horses.add(new HorseJongkyu1("J1"));
        horses.add(new HorseJongkyu2("J2"));
        horses.add(new PineHouse("PH"));
        horses.add(new GoldShip("GS"));
        horses.add(new TokkiTee("TT"));
        horses.add(new RabbitPrincess4("RP"));
        horses.add(new NiceNature("NN"));
        horses.get(0).setStatistics(90, 64, 32, 17, 15);
        horses.get(1).setStatistics(90, 20, 0, 7, 13);
        horses.get(2).setStatistics(90, 16, 7, 5, 4);
        horses.get(3).setStatistics(90, 3, 2, 1, 0);
        horses.get(4).setStatistics(90, 50, 33, 18, 8);
        horses.get(5).setStatistics(90, 18, 0, 3, 15);
        horses.get(6).setStatistics(90, 38, 8, 17, 13);
        horses.get(7).setStatistics(90, 1, 1, 0, 0);
        horses.get(8).setStatistics(90, 51, 7, 22, 22);

        for(int i = 0 ; i< 9; i++) {
            horses.get(i).calDividend();
            horses.get(i).calWinRate();
        }


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
                switch (i){
                    case 1: horses.get(0).plusCountVictory(); horses.get(0).plusCountTop3(); break;
                    case 2: horses.get(0).plusCountSecond(); horses.get(0).plusCountTop3(); break;
                    case 3: horses.get(0).plusCountThird(); horses.get(0).plusCountTop3(); break;
                    case 4: horses.get(0).plusCountFourth(); break;
                    case 5: horses.get(0).plusCountFifth(); break;
                    case 6: horses.get(0).plusCountSixth(); break;
                    case 7: horses.get(0).plusCountSeventh(); break;
                    case 8: horses.get(0).plusCountEighth(); break;
                    case 9: horses.get(0).plusCountNinth(); break;
                    default:
                        System.out.println(0);
                }
                horses.get(0).plusCountRace();
                horses.get(0).calDividend();
                horses.get(0).calWinRate();
            } else if(i == horses.get(1).getRank()){
                System.out.println(horses.get(1).getUmaName() + "가 " + horses.get(1).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(1).plusCountVictory(); horses.get(1).plusCountTop3(); break;
                    case 2: horses.get(1).plusCountSecond(); horses.get(1).plusCountTop3(); break;
                    case 3: horses.get(1).plusCountThird(); horses.get(1).plusCountTop3(); break;
                    case 4: horses.get(1).plusCountFourth(); break;
                    case 5: horses.get(1).plusCountFifth(); break;
                    case 6: horses.get(1).plusCountSixth(); break;
                    case 7: horses.get(1).plusCountSeventh(); break;
                    case 8: horses.get(1).plusCountEighth(); break;
                    case 9: horses.get(1).plusCountNinth(); break;
                    default:
                        System.out.println(1);
                }
                horses.get(1).plusCountRace();
                horses.get(1).calDividend();
                horses.get(1).calWinRate();
            }
            else if(i == horses.get(2).getRank()){
                System.out.println(horses.get(2).getUmaName() + "가 " + horses.get(2).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(2).plusCountVictory(); horses.get(2).plusCountTop3(); break;
                    case 2: horses.get(2).plusCountSecond(); horses.get(2).plusCountTop3(); break;
                    case 3: horses.get(2).plusCountThird(); horses.get(2).plusCountTop3(); break;
                    case 4: horses.get(2).plusCountFourth(); break;
                    case 5: horses.get(2).plusCountFifth(); break;
                    case 6: horses.get(2).plusCountSixth(); break;
                    case 7: horses.get(2).plusCountSeventh(); break;
                    case 8: horses.get(2).plusCountEighth(); break;
                    case 9: horses.get(2).plusCountNinth(); break;
                    default:
                        System.out.println(2);
                }
                horses.get(2).plusCountRace();
                horses.get(2).calDividend();
                horses.get(2).calWinRate();
            }
            else if(i == horses.get(3).getRank()){
                System.out.println(horses.get(3).getUmaName() + "가 " + horses.get(3).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(3).plusCountVictory(); horses.get(3).plusCountTop3(); break;
                    case 2: horses.get(3).plusCountSecond(); horses.get(3).plusCountTop3(); break;
                    case 3: horses.get(3).plusCountThird(); horses.get(3).plusCountTop3(); break;
                    case 4: horses.get(3).plusCountFourth(); break;
                    case 5: horses.get(3).plusCountFifth(); break;
                    case 6: horses.get(3).plusCountSixth(); break;
                    case 7: horses.get(3).plusCountSeventh(); break;
                    case 8: horses.get(3).plusCountEighth(); break;
                    case 9: horses.get(3).plusCountNinth(); break;
                    default:
                        System.out.println(3);
                }
                horses.get(3).plusCountRace();
                horses.get(3).calDividend();
                horses.get(3).calWinRate();
            }
            else if(i == horses.get(4).getRank()){
                System.out.println(horses.get(4).getUmaName() + "가 " + horses.get(4).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(4).plusCountVictory(); horses.get(4).plusCountTop3(); break;
                    case 2: horses.get(4).plusCountSecond(); horses.get(4).plusCountTop3(); break;
                    case 3: horses.get(4).plusCountThird(); horses.get(4).plusCountTop3(); break;
                    case 4: horses.get(4).plusCountFourth(); break;
                    case 5: horses.get(4).plusCountFifth(); break;
                    case 6: horses.get(4).plusCountSixth(); break;
                    case 7: horses.get(4).plusCountSeventh(); break;
                    case 8: horses.get(4).plusCountEighth(); break;
                    case 9: horses.get(4).plusCountNinth(); break;
                    default:
                        System.out.println(4);
                }
                horses.get(4).plusCountRace();
                horses.get(4).calDividend();
                horses.get(4).calWinRate();
            }
            else if(i == horses.get(5).getRank()){
                System.out.println(horses.get(5).getUmaName() + "가 " + horses.get(5).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(5).plusCountVictory(); horses.get(5).plusCountTop3(); break;
                    case 2: horses.get(5).plusCountSecond(); horses.get(5).plusCountTop3(); break;
                    case 3: horses.get(5).plusCountThird(); horses.get(5).plusCountTop3(); break;
                    case 4: horses.get(5).plusCountFourth(); break;
                    case 5: horses.get(5).plusCountFifth(); break;
                    case 6: horses.get(5).plusCountSixth(); break;
                    case 7: horses.get(5).plusCountSeventh(); break;
                    case 8: horses.get(5).plusCountEighth(); break;
                    case 9: horses.get(5).plusCountNinth(); break;
                    default:
                        System.out.println(5);
                }
                horses.get(5).plusCountRace();
                horses.get(5).calDividend();
                horses.get(5).calWinRate();
            }
            else if(i == horses.get(6).getRank()){
                System.out.println(horses.get(6).getUmaName() + "가 " + horses.get(6).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(6).plusCountVictory(); horses.get(6).plusCountTop3(); break;
                    case 2: horses.get(6).plusCountSecond(); horses.get(6).plusCountTop3(); break;
                    case 3: horses.get(6).plusCountThird(); horses.get(6).plusCountTop3(); break;
                    case 4: horses.get(6).plusCountFourth(); break;
                    case 5: horses.get(6).plusCountFifth(); break;
                    case 6: horses.get(6).plusCountSixth(); break;
                    case 7: horses.get(6).plusCountSeventh(); break;
                    case 8: horses.get(6).plusCountEighth(); break;
                    case 9: horses.get(6).plusCountNinth(); break;
                    default:
                        System.out.println(6);
                }
                horses.get(6).plusCountRace();
                horses.get(6).calDividend();
                horses.get(6).calWinRate();
            }
            else if(i == horses.get(7).getRank()){
                System.out.println(horses.get(7).getUmaName() + "가 " + horses.get(7).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(7).plusCountVictory(); horses.get(7).plusCountTop3(); break;
                    case 2: horses.get(7).plusCountSecond(); horses.get(7).plusCountTop3(); break;
                    case 3: horses.get(7).plusCountThird(); horses.get(7).plusCountTop3(); break;
                    case 4: horses.get(7).plusCountFourth(); break;
                    case 5: horses.get(7).plusCountFifth(); break;
                    case 6: horses.get(7).plusCountSixth(); break;
                    case 7: horses.get(7).plusCountSeventh(); break;
                    case 8: horses.get(7).plusCountEighth(); break;
                    case 9: horses.get(7).plusCountNinth(); break;
                    default:
                        System.out.println(7);
                }
                horses.get(7).plusCountRace();
                horses.get(7).calDividend();
                horses.get(7).calWinRate();
            }
            else if(i == horses.get(8).getRank()){
                System.out.println(horses.get(8).getUmaName() + "가 " + horses.get(8).getRank() + "등을 차지했습니다!");
                switch (i){
                    case 1: horses.get(8).plusCountVictory(); horses.get(8).plusCountTop3(); break;
                    case 2: horses.get(8).plusCountSecond(); horses.get(8).plusCountTop3(); break;
                    case 3: horses.get(8).plusCountThird(); horses.get(8).plusCountTop3(); break;
                    case 4: horses.get(8).plusCountFourth(); break;
                    case 5: horses.get(8).plusCountFifth(); break;
                    case 6: horses.get(8).plusCountSixth(); break;
                    case 7: horses.get(8).plusCountSeventh(); break;
                    case 8: horses.get(8).plusCountEighth(); break;
                    case 9: horses.get(8).plusCountNinth(); break;
                    default:
                        System.out.println(8);
                }
                horses.get(8).plusCountRace();
                horses.get(8).calDividend();
                horses.get(8).calWinRate();
            }
        }
    }

    public boolean isRaceStatus() {
        return raceStatus;
    }

    public void setRaceStatus(boolean raceStatus) {
        this.raceStatus = raceStatus;
    }

    public void setTmpTurn() {
        this.tmpTurn = 0;
    }
}
