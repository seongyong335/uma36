package uma.sahmyook.function;

import uma.sahmyook.horse.*;
public class UmaRace {

    public static int ran = 1;                                   //경기 등수 체크용

    public void setGame(MainHorse horse){                        //경기 설정 메소드
        horse.setDistance(30);              //경기 길이 설정
        ran = 1;                            //경기 끝나면 등수 설정용
        horse.setFinish(false);             //경주마의 상태를 경기 상태로 변경
        for(int i = 0; i < horse.getDistance()+10; i++){           //거리만큼 거리 추가
            horse.setRaceSpace();
        }
        horse.setRaceProgress();
    }

    public void startUmaRace(MainHorse horse){                 //경주마 달리기 시작 메소드
        checkRace(horse);                                                       //움직이고나서 결승선을 통과했는지 확인
        System.out.println(horse.getRaceProgress() + " " + horse.getDistance() + " " + horse.getRank());        //경주마 현 위치 표시
        if(horse.isFinish() == true){                       //골인한 상태면 아무런 행동을 하지 않는다.
            try {
                Thread.sleep(1000);                                                //게임 속도 조절
            } catch (Exception e) {
            }
        } else {                                            //골인한 상태가 아니면 달린다.
            try {
                for (int j = 0; j < horse.calMove(); j++) {                             //말의 move 값만큼 움직여라
                    horse.showRun();                                            //앞으로 움직는 모습 출력
                    horse.setDistance(horse.getDistance() - 1);                         //도착까지 남은 거리 설정
                }
                Thread.sleep(1000);                                                //게임 속도 조절
            } catch (Exception e) {
            }
        }
    }

    public void checkRace(MainHorse horse){                                                                //경주마 등수 설정 메소드
        if(horse.getDistance() <= 0){                                                                  //완주했으면 등수 매김
            horse.setRank(ran);
            ran += 1;
            horse.setDistance(10000);
            horse.setFinish(true);                                                                      //완주 상태로 바꿈
        }
    }
}
