package TeamPorject;

import java.util.Scanner;

public class Cinema2 {
    // 좌석
    private String[][] seat;
    // 예매번호
    private int reservationNumber;

    // 메뉴선택 -> 예매하기
    private final int MAKE_A_RESERVATION = 1;
    // 메뉴선택 -> 예매조회
    private final int RESERVATION_INQUIRY = 2;
    // 메뉴선택 -> 예매취소
    private final int RESERVATION_CANCELLATION = 3;

    // 예매하시겠습니까? -> 예
    private final int ANSWER_YES = 1;
    // 예매하시겠습니까? -> 아니요
    private final int ANSWER_NO = 2;
    // 예매하시겠습니까? -> 초기화면으로
    private final int RETURN_TO_HOME = 0;

    private Scanner scanner;

    public Cinema2() {
        this(4, 5);
    }

    public Cinema2(int row, int col) {
        reservationNumber = 10000000;
        scanner = new Scanner(System.in);
        seat = new String[row][col];
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = "__";
            }
        }
    }

    /******************** 고객 메뉴 선택 메서드 *******************/
    /**
     * 영화 예매 시스템 메뉴 출력
     * 
     * @return
     * @author 안승주
     */
    private int menu() {
        while (true) {
            System.out.println("******************************");
            System.out.println("*********영화 예매 시스템**********");
            System.out.println("******************************");
            System.out.println("1. 예매하기");
            System.out.println();
            System.out.println("2. 예매조회");
            System.out.println();
            System.out.println("3. 예매취소");

            int choiceNum = 0;

            do {
                choiceNum = scanner.nextInt();
                System.out.println(choiceNum);
            } while (choiceNum > 3 || choiceNum < 1);
            return choiceNum;
        }

    }

    /**
     * 예매 가능 메시지 출력
     * 
     * @return
     * @author 문형철
     */
    private int menuChoice() {
        int menu = 0;
        System.out.println("예매 가능합니다. 예매하시겠습니까?");
        do {
            System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
            menu = scanner.nextInt();
        } while (menu < 0 || menu > 2);
        return menu;
    }

    /*******************************************************/

    /**
     * 예매 프로그램 시작
     * 
     * @author 문형철
     */
    public void ticketing() {

        do {
            int menu = menu();

            if (menu == 1) {
                // 예매하기
                booking();
            } else if (menu == 2) {
                // 예매조회
                checkSystem();
            } else if (menu == 3) {
                // 예매취소
                cancel();
            } else {
                System.out.println("프로그램을 종료합니다.");
                scanner.close();
                break;
            }
        } while (true);

    }

    /**
     * 
     * @author 문형철, 하준수, 안승주
     */
    private void booking() {

        // 좌석현황
        seatSee();

        System.out.println("좌석을 선택해주세요. 예)1-1");
        System.out.println("이미 예약된 좌석은 \"예매\"라고 표시됩니다.");

        scanner.nextLine();
        String strSeatChoice = scanner.nextLine();

        // TODO : 정수와 '-'만 남긴다

        // String형식 번호 -> 정수형태로 변환
        String rowString = "";
        String colString = "";

        // 앞 숫자인지 뒷숫자인지 판별하기 위한 변수
        // true -> rowString 정수를 문자열로 담는다.
        // false -> colString 정수를 문자열로 담는다.
        boolean pass = true;

        for (int i = 0; i < strSeatChoice.length(); i++) {
            char c = strSeatChoice.charAt(i);
            // TODO : '-' 2개이상인 경우 예매화면부터 다시 시작

            // '-' 이 전에 있는 정수는 rowString에 담는다
            // '-' 이 후에 있는 정수는 colString에 담는다
            if (c == '-') {
                pass = false;
                continue;//바로 for 문으로
            }

            // 숫자를 이어 붙인다
            if (pass) {
                rowString = "" + c;
            }

            // 다른변수 숫자를 이어 붙인다
            if (!pass) {
                colString = "" + c;
            }
        }

        int rowNumber = Integer.parseInt(rowString) - 1;
        int colNumber = Integer.parseInt(colString) - 1;

        // 좌석배열의 크기를 넘는 경우
        if (rowNumber < 0 || rowNumber > seat.length || colNumber < 0 || colNumber > seat[rowNumber].length) {
            System.out.println("없는 좌석입니다. 다시 선택해주세요.");
            booking();
            return;
        }

        // 빈 좌석일 경우
        if (seat[rowNumber][colNumber].equals("__")) {

            switch (menuChoice()) {
            case 1:
                checkalarm(rowNumber, colNumber);
                break;
            case 2:
                booking();
                return;
            case 0:
                ticketing();
                return;
            }

        }
        // 이미 예약된 좌석일 경우
        else {
            System.out.println("이미 예약된 좌석입니다.");
            booking();
            return;
        }

    }

    /**
     * 
     * @param row
     * @param col
     * @author 안승주
     */
    private void checkalarm(int row, int col) {
        System.out.println("예메가 완료되었습니다.");
        reservationNumber++;
        seat[row][col] = "" + reservationNumber;
    }

    /**
     * 
     * @author 조하선
     */
    private void checkSystem() {
        // 예매번호 조회
        scanner.nextLine();
        System.out.println("예매번호를 입력해주세요");
        String serialNumber = scanner.nextLine();
        for (int col = 0; col < seat.length; col++) {
            for (int row = 0; row < seat[col].length; row++) {
                if (seat[col][row].equals(serialNumber)) { // 예매한 좌석 출력
                    System.out.printf("고객님이 예매하신 좌석은 %d-%d 입니다.\n", col + 1, row + 1);
                }
            }
        }

        // 예매번호가 일치하는 것이 없는 경우

    }

    /**
     * @author 하준수
     */
    private void seatSee() {

        System.out.println("***********좌석 현황************");
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                String strSeat = "[" + (i + 1) + "-" + (j + 1) + "]";
                System.out.print((seat[i][j].equals("__")) ? strSeat : "예매");
            }
            System.out.println();
        }
        
        System.out.println("--------------------------");
    }

    /**
     * @author 김진아
     */
    // 메소드
    private void cancel() {

        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {

//                i = row;
//                j = col;

                seat[i][j] = "row" + "-" + "col"; // 좌석
            }
        }

        // seat[i][j] = reservationNumber; 좌석과 예약 번호 연결 에러

        System.out.println("예약번호를 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        System.out.println(userNumber1);

        // 좌석과 예약 번호 연결 필요

//        System.out.println("고객님이 예약하신 좌석은 " + row + "-" + col + " 입니다.");

        System.out.println("예매를 취소하시겠습니까?");
        System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");

        int userNumber = scanner.nextInt();

        switch (userNumber) {
        case 1:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    if (String.valueOf(userNumber1).equals(seat[i][j])) { // 고객 좌석과 일치하면 예약 취소
                        seat[i][j] = "__";
                        System.out.println("예약이 취소 되었습니다.");
//                       seat[row][col] = "___";
                        System.out.println("예매가 취소되었습니다. 감사합니다.");
                        break;
                    }
                }
            }
            break;

        case 2:
            // 초기화면으로
            break;

        }

    }

}
