package uma.sahmyook.score;
import uma.sahmyook.score.*;
public class Score {
    private int nowScore;

    public void PrintNowScore(){ //현재 점수 출력
        System.out.println("현재 점수: " + this.nowScore);
    }

    public void UseScore(int ticket){
        this.nowScore -= ticket*1000;
    }

}
