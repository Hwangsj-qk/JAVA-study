package java_240321.thread.ex;

import java.sql.Time;

public class Ex5 {
        /*
    연습문제: 마법사의 듀얼

    문제 설명:
    두 명의 마법사가 듀얼을 벌입니다. 각 마법사는 번갈아 가며 마법을 사용하며,
    각자 다른 시간 간격으로 마법을 사용할 수 있습니다. 마법사 A는 1초마다 불 마법을,
    마법사 B는 1.5초마다 얼음 마법을 사용합니다. 듀얼은 총 10초 동안 진행되며,
    각 마법사가 마법을 사용할 때마다 사용한 마법과 그 시간을 출력합니다.

    요구사항:
    두 마법사는 별도의 스레드에서 마법을 사용합니다(WizardA 스레드, WizardB 스레드).
    WizardA는 1초 간격, WizardB는 1.5초 간격으로 마법을 사용합니다.
    각 마법 사용 시 "시간 [마법사 이름]이 [마법 종류] 마법을 사용했습니다." 형식으로 출력합니다.
    듀얼은 총 10초 동안 진행되며, 10초가 지나면 두 마법사는 마법 사용을 중단합니다.

    출력예시
    ===
    0.0초 WizardA가 불 마법을 사용했습니다.
    0.0초 WizardB가 얼음 마법을 사용했습니다.
    1.0초 WizardA가 불 마법을 사용했습니다.
    1.5초 WizardB가 얼음 마법을 사용했습니다.
    2.0초 WizardA가 불 마법을 사용했습니다.
    3.0초 WizardB가 얼음 마법을 사용했습니다.
    4.0초 WizardA가 불 마법을 사용했습니다.
    5.0초 WizardA가 불 마법을 사용했습니다.
    6.0초 WizardB가 얼음 마법을 사용했습니다.
    6.0초 WizardA가 불 마법을 사용했습니다.
    7.0초 WizardA가 불 마법을 사용했습니다.
    7.5초 WizardB가 얼음 마법을 사용했습니다.
    8.0초 WizardA가 불 마법을 사용했습니다.
    9.0초 WizardB가 얼음 마법을 사용했습니다.
    9.0초 WizardA가 불 마법을 사용했습니다.
    WizardB의 마법 사용이 중단되었습니다.
    WizardA의 마법 사용이 중단되었습니다.
    마법 듀얼이 종료되었습니다.

    힌트: System.currentTimeMillis()를 사용하여 시작 시간을 기록하고,
    각 마법사의 스레드에서 현재 시간이 시작 시간으로부터 얼마나 지났는지 계산하여 마법 사용 여부를 결정합니다.
     Thread.sleep() 메서드를 사용하여 각 마법사의 마법 사용 간격을 제어할 수 있습니다.
     */

    public static void main(String[] args) throws InterruptedException {
        double startTime = System.currentTimeMillis();

        Thread wizardA = new Thread(() ->{
            while (true) {
                System.out.println(String.format("%.1f",
                        ((double)System.currentTimeMillis() - startTime)/1000)
                        + "초 WizardA가 불 마법을 사용했습니다.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("WizardA의 마법 사용이 중단되었습니다.");
                    return;
                }
            }
        });

        Thread wizardB = new Thread(() -> {
            while (true) {
                System.out.println(String.format("%.1f",
                        ((double)System.currentTimeMillis() - startTime)/1000) +
                        "초 WizardB가 얼음 마법을 사용했습니다.");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("WizardB의 마법 사용이 중단되었습니다.");
                    return;
                }
            }
        });

        wizardA.start();
        wizardB.start();


        Thread.sleep(10000);

        wizardA.interrupt();
        wizardB.interrupt();

        wizardA.join();
        wizardB.join();

        System.out.println();
        System.out.println("마법 듀얼이 종료되었습니다. ");



    }




}
