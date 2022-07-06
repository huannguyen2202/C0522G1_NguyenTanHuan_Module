package ss4_class_and_object.exercise.exercise_2;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1; i <= 100000; i++) {
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.print(stopWatch.getElapsedTime());
    }
}
