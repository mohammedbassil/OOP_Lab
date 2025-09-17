public class ThreadRaceSimulation {
    static class Racer extends Thread {
        private String name;
        private int distanceToRun;

        public Racer(String name, int distanceToRun) {
            this.name = name;
            this.distanceToRun = distanceToRun;
        }

        @Override
        public void run() {
            for (int i = 1; i <= distanceToRun; i++) {
                try {
                    // Simulate running time with random sleep
                    Thread.sleep((int)(Math.random() * 100));
                } catch (InterruptedException e) {
                    System.out.println(name + " was interrupted!");
                }
                System.out.println(name + " ran " + i + " meters");
            }
            System.out.println(name + " has finished the race!");
        }
    }

    public static void main(String[] args) {
        int raceDistance = 10; // meters

        Racer racer1 = new Racer("🏃 Racer 1", raceDistance);
        Racer racer2 = new Racer("🏃 Racer 2", raceDistance);

        System.out.println("Race starts now!");
        racer1.start();
        racer2.start();

        try {
            racer1.join();
            racer2.join();
        } catch (InterruptedException e) {
            System.out.println("Race was interrupted!");
        }

        System.out.println("Race is over!");
    }
}
