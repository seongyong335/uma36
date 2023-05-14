package uma.sahmyook.function;

public class Horses{
    /* 필수로 추가되어야 할 필드 */
    private StringBuilder raceProgress = new StringBuilder();       //경기 진행 상태
    private int distance;                                           //남은 거리
    private int rank;                                               //등수
    private boolean finish = true;                                  //경기 상태

    /* 필수로 추가되어야 할 메소드 */
    public void setRaceProgress() {                     //움직인만큼 이동 메소드
        this.raceProgress.insert(0, ' ');
    }

    public Horses(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        this.umaName = nam;
        this.raceProgress.append(getUmaName());
    }

    public StringBuilder getRaceProgress() {         //get 경기 진행상태
        return this.raceProgress;
    }

    public int getDistance() {                      //get 남은거리
        return distance;
    }

    public void setDistance(int distance) {        //set 남은거리
        this.distance = distance;
    }

    public boolean isFinish() {                   //get 경기 상태
        return finish;
    }

    public void setFinish(boolean finish) {      //set 경기 상태
        this.finish = finish;
    }

    public int getRank() {                      //get 등수
        return rank;
    }

    public void setRank(int rank) {             //set 등수
        this.rank = rank;
    }

    /* -------------------------------------------------------------------------------------------------------------- /

    /* 임시로 만든 필드 */
    private String umaName;         //임시값
    private int speed = 6;          //임시값
    private int move;               //임시값


    /* 임시로 만든 메소드 */
    public Horses(){}

    public void setMove(int move) {             //임시값
        this.move = move;
    }

    public String getUmaName() {                //임시값
        return umaName;
    }

    public int getSpeed() {                     //임시값
        return this.speed;
    }

    public int getMove() {                      //임시값
        return this.move;
    }
}
