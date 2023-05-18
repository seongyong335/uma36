package uma.sahmyook.function;


import uma.sahmyook.menu.MainMenu;
import uma.sahmyook.score.BettingScore;
import uma.sahmyook.score.Round;

import static uma.sahmyook.menu.MainMenu.us;

public class UmaStart {

    BettingScore bs = new BettingScore();

    public void umaStart() {
        if (0 >= MainMenu.ticket || MainMenu.ticket <= 11 && MainMenu.horseNum == 0){
            System.out.println("응원 말을 선택해주세요");
        return; }
            /* 경기 생성 및 시작 */
        UmaThread a = new UmaThread(0);
        UmaThread b = new UmaThread(1);
        UmaThread c = new UmaThread(2);
        UmaThread d = new UmaThread(3);
        UmaThread e = new UmaThread(4);
        UmaThread f = new UmaThread(5);
        UmaThread g = new UmaThread(6);
        UmaThread h = new UmaThread(7);
        UmaThread i = new UmaThread(8);

        //ClearThread clear = new ClearThread();

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
        //clear.start();
        try {
            a.join();
            b.join();
            c.join();
            d.join();
            e.join();
            f.join();
            g.join();
            h.join();
            i.join();
        } catch (InterruptedException P) {
            throw new RuntimeException(P);
        }

        us.checkRank();
        bs.bettingResult();
        Round.roundReset();
        System.out.print("Enter를 눌러주세요...");
        MainMenu.sc.nextLine();
        System.out.println("\n");
    }
}
