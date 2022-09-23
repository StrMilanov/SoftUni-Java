package FirstStepsInCoding.Exercises_03;

import java.util.Scanner;

public class A08_OnTimeForTheExam_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examMinuteTotal = examHour * 60 + examMinute;
        int arrivalMinuteTotal = arrivalHour * 60 + arrivalMinute;
        int earlyTimeDifference = examMinuteTotal - arrivalMinuteTotal;
        int lateTimeDifference = arrivalMinuteTotal - examMinuteTotal;
        String status = "";

        if (earlyTimeDifference >= 0 && earlyTimeDifference <= 30) {
            status = "On time";
        } else if (earlyTimeDifference > 30) {
            status = "Early";
        } else {
            status = "Late";
        }

        switch (status) {
            case "On time":
                System.out.println(status);
                if (earlyTimeDifference != 0) {
                    System.out.printf("%d minutes before the start", earlyTimeDifference);
                }
                break;
            case "Early":
                System.out.println(status);
                if (earlyTimeDifference < 60){
                    System.out.printf("%d minutes before the start", earlyTimeDifference);
                } else {
                    System.out.printf("%d:%02d hours before the start", earlyTimeDifference / 60, earlyTimeDifference % 60);
                }
                break;
            case "Late":
                System.out.println(status);
                if (lateTimeDifference < 60){
                    System.out.printf("%d minutes after the start", lateTimeDifference);
                } else {
                    System.out.printf("%d:%02d hours after the start", lateTimeDifference / 60, lateTimeDifference % 60);
                }
                break;
        }

    }
}
