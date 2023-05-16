package uma.sahmyook;


import uma.sahmyook.function.UmaStadium;
import uma.sahmyook.function.UmaThread;

public class Application {

    public static void main(String[] args) {

        UmaStadium us = new UmaStadium();
            /* 경기 생성 및 시작 */
        UmaThread a = new UmaThread(0);
        UmaThread b = new UmaThread(1);
        UmaThread c = new UmaThread(2);
        UmaThread d = new UmaThread(3);

        a.start();
        b.start();
        c.start();
        d.start();
        try {
            a.join();
            b.join();
            c.join();
            d.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        us.checkRank();
    }
}
