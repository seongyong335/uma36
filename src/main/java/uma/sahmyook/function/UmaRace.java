package uma.sahmyook.function;

import uma.sahmyook.horse.*;
public class UmaRace {

    private StringBuilder raceProgress = new StringBuilder();       //경기 표시용
    public static int ran = 0;                                   //경기 등수 체크용
//    private int umaCount = 4;                                   //경기 출장 경기마 수

//    private MainHorse mh;
//    public void startGame(){                                    //경기 시작 메소드
//        //경주마선언(차후엔 배당 낮은 순으로 등록된 말들을 선언하게끔 셋)
////        UmaThread a = new UmaThread(new MainHorse("a"));
////        UmaThread b = new UmaThread(new MainHorse("b"));
////        UmaThread c = new UmaThread(new MainHorse("c"));
////        UmaThread d = new UmaThread(new MainHorse("d"));
////
////        a.start();
////        b.start();
////        c.start();
////        d.start();
////
////        if(a.getMh().isFinish() == true && b.getMh().isFinish() == true && c.getMh().isFinish() == true && d.getMh().isFinish() == true){
////
////            try {
////                a.join();
////                b.join();
////                c.join();
////                d.join();
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////
////            resultRace(a.getMh(), b.getMh(), c.getMh(), d.getMh());
////        }
//
//    }

    public void setGame(MainHorse horse){                        //경기 설정 메소드
        horse.setDistance(30);              //경기 길이 설정
        ran = 1;                            //경기 끝나면 등수 설정용
        horse.setFinish(false);             //경주마의 상태를 경기 상태로 변경
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
                    horse.setRaceProgress();                                            //앞으로 움직는 모습 출력
                    horse.setDistance(horse.getDistance() - 1);                         //도착까지 남은 거리 설정
                }
                Thread.sleep(1000);                                                //게임 속도 조절
            } catch (Exception e) {
            }
        }
    }

//    public void finishRace(MainHorse horse){
//        System.out.println("|" + "                                                     |" + horse.getUmaName());
//    }

//    public void resultRace(MainHorse horse1, MainHorse horse2, MainHorse horse3, MainHorse horse4){                //경기 결과 출력 메소드
////        for(int i = 1; i <= umaCount; i++){                                                            //경주마 수만큼 결과 출력
////            if(i == horse1.getMh().getRank()){                                                                 //경주마 등수 높은 순으로 출력
////                System.out.println(horse1.getMh().getUmaName() + "가 " + horse1.getMh().getRank() + "등을 차지했습니다!");
////            } else if(i == horse2.getMh().getRank()){
////                System.out.println(horse2.getMh().getUmaName() + "가 " + horse2.getMh().getRank() + "등을 차지했습니다!");
////            } else if(i == horse3.getMh().getRank()){
////                System.out.println(horse3.getMh().getUmaName() + "가 " + horse3.getMh().getRank() + "등을 차지했습니다!");
////            } else if(i == horse4.getMh().getRank()){
////                System.out.println(horse4.getMh().getUmaName() + "가 " + horse4.getMh().getRank() + "등을 차지했습니다!");
////            }
////        }
//
//        for(int i = 1; i <= umaCount; i++){                                                            //경주마 수만큼 결과 출력
//            if(i == horse1.getRank()){                                                                 //경주마 등수 높은 순으로 출력
//                System.out.println(horse1.getUmaName() + "가 " + horse1.getRank() + "등을 차지했습니다!");
//            } else if(i == horse2.getRank()){
//                System.out.println(horse2.getUmaName() + "가 " + horse2.getRank() + "등을 차지했습니다!");
//            } else if(i == horse3.getRank()){
//                System.out.println(horse3.getUmaName() + "가 " + horse3.getRank() + "등을 차지했습니다!");
//            } else if(i == horse4.getRank()){
//                System.out.println(horse4.getUmaName() + "가 " + horse4.getRank() + "등을 차지했습니다!");
//            }
//        }
//
//    }

    public void checkRace(MainHorse horse){                                                                //경주마 등수 설정 메소드
        if(horse.getDistance() <= 0){                                                                  //완주했으면 등수 매김
            horse.setRank(ran);
            ran += 1;
            horse.setDistance(100);
            horse.setFinish(true);                                                                      //완주 상태로 바꿈
        }
    }
}
