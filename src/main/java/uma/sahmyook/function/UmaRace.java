package uma.sahmyook.function;

public class UmaRace {

    private StringBuilder raceProgress = new StringBuilder();       //경기 표시용
    protected static int ran;                                   //경기 등수 체크용
    private int umaCount = 4;                                   //경기 출장 경기마 수

    public void startGame(){                                    //경기 시작 메소드
        //경주마선언(차후엔 배당 낮은 순으로 등록된 말들을 선언하게끔 셋)
        Horses a = new Horses("a");
        Horses b = new Horses("b");
        Horses c = new Horses("c");
        Horses d = new Horses("d");

        //경주마들 경기 설정
        setGame(a);
        setGame(b);
        setGame(c);
        setGame(d);

        do{
            //모두가 끝날때 까지 경기 시작
            startUmaRace(a);
            startUmaRace(b);
            startUmaRace(c);
            startUmaRace(d);
        } while (a.isFinish() == false || b.isFinish() == false || c.isFinish() == false || d.isFinish() == false);

        resultRace(a, b, c, d);             //경기 결과 출력

    }

    public void setGame(Horses horse){                        //경기 설정 메소드
        horse.setDistance(30);              //경기 길이 설정
        ran = 1;                            //경기 끝나면 등수 설정용
        horse.setFinish(false);             //경주마의 상태를 경기 상태로 변경
    }

    public void startUmaRace(Horses horse){                 //경주마 달리기 시작 메소드
        System.out.println(horse.getRaceProgress());        //경주마 현 위치 표시
        if(horse.isFinish() == true){                       //골인한 상태면 아무런 행동을 하지 않는다.
        } else {                                            //골인한 상태가 아니면 달린다.
            try {
                horse.setMove((int)((Math.random() * horse.getSpeed()) + 1));           //말의 move 임시값으로 설정
                for (int j = 0; j < horse.getMove(); j++) {                             //말의 move 값만큼 움직여라
                    horse.setRaceProgress();                                            //앞으로 움직는 모습 출력
                    horse.setDistance(horse.getDistance() - 1);                         //도착까지 남은 거리 설정
                }
                checkRace(horse);                                                       //움직이고나서 결승선을 통과했는지 확인
                Thread.sleep(500);                                                //게임 속도 조절
            } catch (Exception e) {
            }
        }
    }

    public void resultRace(Horses horse1, Horses horse2, Horses horse3, Horses horse4){                //경기 결과 출력 메소드
        for(int i = 1; i <= umaCount; i++){                                                            //경주마 수만큼 결과 출력
            if(i == horse1.getRank()){                                                                 //경주마 등수 높은 순으로 출력
                System.out.println(horse1.getUmaName() + "가 " + horse1.getRank() + "등을 차지했습니다!");
            } else if(i == horse2.getRank()){
                System.out.println(horse2.getUmaName() + "가 " + horse2.getRank() + "등을 차지했습니다!");
            } else if(i == horse3.getRank()){
                System.out.println(horse3.getUmaName() + "가 " + horse3.getRank() + "등을 차지했습니다!");
            } else if(i == horse4.getRank()){
                System.out.println(horse4.getUmaName() + "가 " + horse4.getRank() + "등을 차지했습니다!");
            }
        }
    }

    public void checkRace(Horses horse){                                                                //경주마 등수 설정 메소드
        if(horse.getDistance() <= 0 ){                                                                  //완주했으면 등수 매김
            horse.setRank(ran);
            ran++;
            horse.setFinish(true);                                                                      //완주 상태로 바꿈
        }
    }
}
