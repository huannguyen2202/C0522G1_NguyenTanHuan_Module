package ss4_class_and_object.exercise.exercise_3;

public class Fan {
     static final int SLOW = 1;
     static final int MEDIUM = 2;
     static final int FAST = 3;
    private double radius = 5;
    private String color = "màu xanh";
    private boolean on = false;
    int speed = SLOW;
    public int getFAST(){
        return FAST;
    }
    public int getSLOW(){
        return SLOW;
    }
    public int getMEDIUM(){
        return MEDIUM;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan() {
        on = isOn();
        color = getColor();
        radius = getRadius();
        speed = getSpeed();
    }
    public Fan(int speed, String color, double radius, boolean on) {
        this.on = isOn();
        this.color = getColor();
        this.radius = getRadius();
        this.speed = getSpeed();
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ",color: " + getColor() + ",radius: " + getRadius() + ",fan is on";
        }
        return "color: " + getColor() + ",radius: " + getRadius() + ",fan is off";
    }
}
