package java_240321.thread.ex;

public class Ex5_ans {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Wizard("마법사A", 1000, "불"));
        Thread threadB = new Thread(new Wizard("마법사B", 1500, "얼음"));
        threadA.start();
        threadB.start();

        // 10지나면 듀얼이 종료됨
      Thread.sleep(10000);

        threadA.interrupt();
        threadB.interrupt();

        threadA.join();
        threadB.join();
        System.out.println("듀얼이 종료되었습니다. ");


    }

   static class Wizard implements Runnable {
        String name;
        int interval;
        String type;

        public Wizard(String name, int interval, String type) {
            this.name = name;
            this.interval = interval;
            this.type = type;
        }

        @Override
        public void run() {
            double startTime = System.currentTimeMillis();
            while (true) {
                double time = ((double)System.currentTimeMillis() - startTime)/1000;
                String formatted = String.format("%.1f초 %s가 %s 마법을 사용했습니다. ", time, name, type);
                System.out.println(formatted);

                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    System.out.println(name + "의 마법 사용이 중단되었습니다. ");
                    return;
                }
            }
        }
    }
}
