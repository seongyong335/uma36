package uma.sahmyook.score;

import java.util.Scanner;

public class Ticket {
    public int ticket = 0;
    int no = 0;

    private void buyTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 마권의 수량을 입력해주세요(1~10)");
        no = 0;
        no = sc.nextInt();
        if(no<1 || no>10){
            System.out.println("1~10까지의 마권을 구매할 수 있습니다.");
            return;
        }
        Score score = new Score();
        score.UseScore(no); //useSore 불러오기

        this.ticket += no;
        System.out.println(no + "개의 마권 구매완료");



    }


}
