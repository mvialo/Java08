
public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void takeOff() {
        if (this.getAltitude() == 0 && this.isFlying() == false) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        } else {
            System.out.println(this.getName() + "is already flying");
        }
    }

    @Override
    public void ascend(int addedAltitude) {
        this.altitude = altitude + addedAltitude;
        System.out.println(this.getName() + " flies upward, altitude : " + String.valueOf(this.getAltitude()));
    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }

    @Override
    public void descend(int addedAltitude) {
        this.altitude = altitude - addedAltitude;
        System.out.println(this.getName() + " flies downward, altitude : " + String.valueOf(this.getAltitude()));
    }

    @Override
    public void land() {
        if (this.altitude < 10) {
            this.altitude = 0;
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
