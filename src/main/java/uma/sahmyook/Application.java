package uma.sahmyook;


import uma.sahmyook.function.UmaStadium;
import uma.sahmyook.function.UmaThread;

public class Application {

    public static void main(String[] args) {

        UmaStadium us = new UmaStadium();           //경기장 생성
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

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
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

    }
}
