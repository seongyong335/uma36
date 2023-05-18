package uma.sahmyook.horse;

public class Horse7 extends MainHorse{
//stamina가 70일 때 한턴 쉼, 대신 속도값 조정 가능 ( 다른말보다 조금 빠르게 )

    public Horse7() {}                                      // 기본 생성자

    public Horse7(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정
        super(nam);
    }               // 말의 이름을 매개변수로 받는 생성자

    @Override
    public int calMove(){                                   // 말의 속도를 리턴받는 메소드
        randomSpeed();
        useStamina();
        if(getStamina() == 70){
            setSpeed(0);
            return 0;
        }

        if(getStamina()<50){
            setSpeed(getSpeed()/2);
        }

        return getSpeed();
    }





}
