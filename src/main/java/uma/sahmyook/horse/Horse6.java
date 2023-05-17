package uma.sahmyook.horse;

public class Horse6 extends MainHorse{
    //기본 말 기능만 가짐



    public Horse6() {
    }

    public Horse6(String nam) {             //경주마 생성과 해당 경주마를 대표하는 아이콘 설정

        setUmaName(nam);
        setRaceProgress(nam);
    }
}
