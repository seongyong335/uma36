package uma.sahmyook.horse;

import java.text.DecimalFormat;

public class MainHorse {

    private double dividend;


    private int speed;                               // 리턴받을 랜덤한 속도값, 리턴받아서 쓸꺼라 protected 접근자 사용
    private int countRace;                    // 경기수를 저장하는 변수, 각 객체마다 저장하면 굳이 static으로 변수를 가질 필요는 없는거 같음
    private int countVictory;                 // 우승횟수를 저장하는 변수, 각 객체마다 저장하면 굳이 static으로 변수를 가질 필요는 없는거 같음
    private int countTop3;                    // 탑3에 들어간 횟수를 저장하는 변수, 각 객체마다 저장하면 굳이 static으로 변수를 가질 필요는 없는거 같음


    private int stamina = 100;                       // 말의 스테미너를 저장하는 변수
    private String umaName;

    private double dividendRate;

    public DecimalFormat df = new DecimalFormat("#.###");

    private double winRate;

    public double calDividend() {
        this.dividendRate = ((this.getCountRace() * 1000.0) / (this.getCountTop3()* 0.5 + this.getCountVictory() * 0.2 + 1)) / 1000.0;

        return Double.parseDouble(df.format(dividendRate));
    }   // 소수점 3째자리까지 나오게 반올림하여 숫자로 만들기

    public double getDividendRate() {
        return dividendRate;
    }

    public double getWinRate() {
        return winRate;
    }

    public double calWinRate(){
        this.winRate = ((this.getCountVictory()*100.0) * 100.0) / this.getCountRace() / 100.0;
        return this.winRate;
    }   // 승률
    public int calMove() {                                   // 실행하는 클래스에서 인스턴스 생성하고 run() 메소드가 실행하면됨
        randomSpeed();
        useStamina();                                   // 달린후 스태미너를 사용합니다.

        if (stamina < 50) {                                 //스테미너가 50미만으로 떨어지면 스피드가 반으로 줄어든다.
            this.speed = getSpeed() / 2;                           //인터페이스로 스테미너 다시 100으로 돌려도되는데 그냥 여기값에서 다시 조정해서 해도됨
        }

        //스피드 오버라이드해서 리턴받을 speed 조작할 수 있음
        return this.speed;
    }

    //말의 속도를 랜덤값으로 받는 함수 ( 아직 미완성 )
    public void randomSpeed() {                              //랜덤으로 스피드 설정

        this.speed = (int) ((Math.random() * 8) + 1) * (int) ((Math.random() * 8) + 1);
    }

    //말이 한번 달릴때 스테미너 10을 사용하는 함수 ( 아직 미완성 )
    public void useStamina() {

        setStamina(getStamina() - 10);

    }

    public void setUmaName(String umaName) {
        this.umaName = umaName;
    }

    public void setStatistics(int countRace, int countTop3, int countVictory) {
        this.countRace = countRace;
        this.countTop3 = countTop3;
        this.countVictory = countVictory;
    }


    public void plusCountRace(){
        this.countRace++;
    }
    public void plusCountVictory(){
        this.countVictory++;
    }
    public void plusCountTop3(){
        this.countTop3++;
    }
    public void setHorseInfo(int countRace,int countVictory,int countTop3){
        this.countRace = countRace;
        this.countVictory = countVictory;
        this.countTop3 = countTop3;
    }


    public int getCountRace() {             //경기수를 리턴받는 메소드
        return countRace;
    }

    public int getCountVictory() {          //승리한 경기수를 리턴받는 메소드
        return countVictory;
    }

    public int getCountTop3() {             //top3에 들어간 경기수를 리턴받는 메소드
        return countTop3;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return this.stamina;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }


    public int setStamina(int stamina) {
        this.stamina = stamina;
        return this.stamina;
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
        } else return Integer.toString(this.getDistance()) + "/30";
    }

    public MainHorse(){}

    public MainHorse(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        this.umaName = nam;
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

    public String getUmaName() {
        return umaName;
    }

    }

