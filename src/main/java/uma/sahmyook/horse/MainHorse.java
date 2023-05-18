package uma.sahmyook.horse;

import java.text.DecimalFormat;

public class MainHorse {
    private int speed;                        // 리턴받을 랜덤한 속도값
    private int countRace;                    // 경기수를 저장하는 변수
    private int countVictory;                 // 우승횟수를 저장하는 변수
    private int countTop3;                    // 탑3에 들어간 횟수를 저장하는 변수
    private int countSecond;
    private int countThird;
    private int countFourth;
    private int countFifth;
    private int countSixth;
    private int countSeventh;
    private int countEighth;
    private int countNinth;
    private int stamina = 100;                // 말의 스테미너를 저장하는 변수
    private String umaName;                   // 말의 이름을 저장하는 변수
    private double dividendRate = 0.0 ;      // 배당률을 저장하는 변수
    public DecimalFormat df = new DecimalFormat("#.###");   // 소수점 세자리까지 나타내는 포멧
    public DecimalFormat ddf = new DecimalFormat("#.#");    // 소수점 첫째자리까지 나타내는 포멧

    private double winRate = 0.0;                                 // 1등할 확률을 저장하는 변수

    public MainHorse() {}                                        // 기본생성자

    public MainHorse(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        this.umaName = nam;
    }         // 말 이름을 매개변수로 받는 생성자

    // 배당률을 구하는 메소드
    public void calDividend() {
        this.dividendRate =50 * (((this.getCountRace() * 1000.0) / ((this.getCountThird()* 1 + this.getCountSecond() * 2 + this.getCountVictory() * 4)+1)) / 10000.0);
        this.dividendRate =Double.parseDouble(df.format(this.dividendRate));
    }   // 소수점 3째자리까지 나오게 반올림하여 숫자로 만들기

    public double getDividendRate() {
        return dividendRate;
    }   // 배당률을 리턴받는 메소드

    public double getWinRate() {
        return winRate;
    }             // 승률을 리턴받는 메소드

    // 승률을 구하는 메소드
    public void calWinRate(){
        this.winRate = (this.getCountVictory() * 1000.0) * 100.0 / ((this.getCountRace() * 1000.0)) ;
        this.winRate = Double.parseDouble(ddf.format(winRate));
    }


    public int calMove() {                                      // 내부 메소드를 수행한 후 속도를 리턴 받는 메소드
        randomSpeed();
        useStamina();

        if (stamina < 50) {
            this.speed = getSpeed() / 2;
        }

        return this.speed;
    }

    public int getCountSecond() {
        return countSecond;
    }

    public int getCountThird() {
        return countThird;
    }

    public void randomSpeed() {                             // 말의 속도를 랜덤으로 대입하는 메소드
        this.speed = (int) ((Math.random() * 8) + 1) * (int) ((Math.random() * 8) + 1);
    }


    public void useStamina() {                          //말이 한번 달릴때 스테미너 10을 사용하는 메소드
        setStamina(getStamina() - 10);
    }

    // 초기 말의 경기정보를 세팅하는 메소드
    public void setStatistics(int countRace, int countTop3, int countVictory) {
        this.countRace = countRace;
        this.countTop3 = countTop3;
        this.countVictory = countVictory;
    }


    public void plusCountRace(){
        this.countRace++;
    }           // 경기수를 1 증가하는 메소드
    public void plusCountVictory(){
        this.countVictory++;
    }     // 우승횟수를 1 증가하는 메소드
    public void plusCountTop3(){
        this.countTop3++;
    }           // 경기수를 1 증가하는 메소드
    public void plusCountSecond(){
        this.countSecond++;
    }
    public void plusCountThird(){
        this.countThird++;
    }
    public void plusCountFourth(){
        this.countFourth++;
    }
    public void plusCountFifth(){
        this.countFifth++;
    }
    public void plusCountSixth(){
        this.countSixth++;
    }
    public void plusCountSeventh(){
        this.countSeventh++;
    }
    public void plusCountEighth(){
        this.countEighth++;
    }
    public void plusCountNinth(){
        this.countNinth++;
    }


    public int getCountRace() {             //경기수를 리턴받는 메소드
        return countRace;
    }             // 경기수를 리턴받는 메소드

    public int getCountVictory() {          //승리한 경기수를 리턴받는 메소드
        return countVictory;
    }       // 우승횟수를 리턴받는 메소드

    public int getCountTop3() {             //top3에 들어간 경기수를 리턴받는 메소드
        return countTop3;
    }             // Top3횟수를 리턴 받는 메소드

    public int getCountFourth() {
        return countFourth;
    }

    public int getCountFifth() {
        return countFifth;
    }

    public int getCountSixth() {
        return countSixth;
    }

    public int getCountSeventh() {
        return countSeventh;
    }

    public int getCountEighth() {
        return countEighth;
    }

    public int getCountNinth() {
        return countNinth;
    }

    public int getSpeed() {
        return this.speed;
    }               // 스피드를 리턴받는 메소드

    public void setSpeed(int speed) {
        this.speed = speed;
    }   // 스피드를 세팅하는 메소드

    public int getStamina() {
        return this.stamina;
    }           // 스테미너를 리턴받는 메소드

    public void setStamina(int stamina) {                       // 매개변수로 받은 정수를 스테미너값에 대입하는 메소드(확인필요)
        this.stamina = stamina;
    }

    /* ----------------------------------경기 필요 필드, 메소드------------------------------------ */
    /* UmaRace 필드 */
    private StringBuilder raceProgress = new StringBuilder();       //경기 진행 상태
    private StringBuilder raceSpace = new StringBuilder();
    private int distance;                                           //남은 거리
    private int rank;                                               //등수
    private boolean finish = true;                                  //경기 상태
    private int turn;

    /* 필수로 추가되어야 할 메소드 */

    public void resetRaceSpace() {
        this.raceProgress.delete(0,this.raceProgress.length());
    }

    public void resetRank(){
        this.rank = 0;
    }

    public void resetSpace(){
        this.raceSpace.delete(0,this.raceSpace.length());
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void showRun() {                     //움직인만큼 이동 메소드
        this.raceProgress.insert(1, ' ');
        this.raceProgress.deleteCharAt(raceProgress.length()-2);
    }

    public String showStatus() {
        if(this.getRank() != 0){
            return Integer.toString(this.getRank()) + "/9";
        } else return Integer.toString(this.getDistance()) + "/50";
    }

    public void setRaceSpace() {
        this.raceSpace.append(' ');
    }

    public void setRaceProgress() {
        this.raceProgress.append("|" + getUmaName() + raceSpace + "|");
    }

    public StringBuilder getRaceProgress() {         //get 경기 진행상태
        return this.raceProgress;
    }

    public int getDistance() {                      //get 남은거리
        return distance;
    }                            // 경기장 길이를 리턴받는 메소드

    public void setDistance(int distance) {        //set 남은거리
        this.distance = distance;
    }     // 경기장 길이를 세팅하는 메소드

    public boolean isFinish() {                   //get 경기 상태
        return finish;
    }

    public void setFinish(boolean finish) {      //set 경기 상태
        this.finish = finish;
    }

    public int getRank() {                      //get 등수
        return rank;
    }                                   // 등수를 리턴받는 메소드

    public void setRank(int rank) {             //set 등수
        this.rank = rank;
    }                     // 등수를 세팅하는 메소드

    public String getUmaName() {
        return umaName;
    }                         // 말 이름을 리턴받는 메소드

    }

