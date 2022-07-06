package ss4_class_and_object.exercise.exercise_2;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return startTime = System.currentTimeMillis();
    }

    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
