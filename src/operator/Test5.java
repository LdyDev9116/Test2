package operator;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 연도와 월을 입력받음
            System.out.print("연도를 입력하세요 (0 입력 시 종료): ");
            int year = scanner.nextInt();

            // 0이 입력되면 프로그램 종료
            if (year == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("월을 입력하세요: ");
            int month = scanner.nextInt();

            // 월이 잘못 입력된 경우 처리
            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다. 1부터 12 사이의 월을 입력하세요.");
                continue; // 다음 반복으로 이동
            }

            // 해당 월의 날 수 계산
            int daysInMonth = getDaysInMonth(year, month);

            // 결과 출력
            System.out.println(year + "년 " + month + "월은 " + daysInMonth + "일까지 있습니다.");
        }
    }

    // 해당 월의 날 수를 계산하는 메서드
    private static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 윤년인 경우 2월의 날 수를 29로 변경
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return daysInMonth[month];
    }

    // 윤년인지 여부를 판별하는 메서드
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}