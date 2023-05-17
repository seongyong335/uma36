package uma.sahmyook.menu;


import uma.sahmyook.function.UmaStadium;

import java.util.Scanner;

public class MainMenu {
    public static Scanner sc = new Scanner(System.in); // 다른 클래스에서 사용할 수 있게 스태틱으로 선언

    static int no;                              // 다른 클래스에서 사용할 수 있게 스태틱으로 선언
    public static int horseNum;
    public static int ticket = 0;

   
    public static int score = 10000;
    static MenuExit menuExit = new MenuExit(); // 메뉴 나가기 클래스 생성
    static SubMenu subMenu = new SubMenu(); // 서브 메뉴 클래스 생성
    public static UmaStadium us = new UmaStadium();           //경기장 생성
    // 메인 메뉴 메소드
    public static void main(String[] args) {

        do{

            System.out.println("================= UMA 경기장에 오신걸 환영합니다!! =================\n\n");
            System.out.println("메뉴를 선택해주세요!\n");
            System.out.println("1. 경기장 입장하기\n");
            System.out.println("2. 프로그램 종료\n");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch(no){
                case 1: subMenu.subMenu(); break;
                case 2: menuExit.Method(1); break;
                default:
                    System.out.println("잘못 입력하셨습니다 다시 입력해주세요!");
            }
        } while(true);
    }
}
