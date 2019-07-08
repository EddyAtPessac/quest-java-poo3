public class Eagle extends Bird implements Fly {

    public static final double MAX_LAND_ALT = 5; // Maximum altitude for landing
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

    public void takeOff() {
        if (!isFlying()) {
            System.out.println(getName() + " taking off.");
            this.flying=true;
        }
        else {
            System.out.println(getName() + " already flying.");
        }
    }
    public void ascend(int meters) {
        if (isFlying()) {
            this.altitude = Math.min(this.altitude + meters, 1500);
            System.out.println(getName() +" fly upware. Altitude:" + getAltitude() + "");
        }
        else {
            System.out.println(getName() + " not flying.");
        }
    }

    public void descend(int meters) {
        if (isFlying()) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(getName() +" fly downware. Altitude:" + getAltitude() + "");
        }
        else {
            System.out.println(getName() + " not flying.");
        }
    }

    public void land (){
        if (isFlying()) {
            if (getAltitude()< MAX_LAND_ALT) {
                System.out.println(getName() + " Landing.");
                this.altitude=0;
                this.flying=false;
            }
        }
        else {
            System.out.println(getName() + " not flying.");
        }

    }

    public void glide() {
        if (isFlying()) {
            System.out.println(getName() +" glide. Altitude:" + getAltitude() + "");
        }
        else {
            System.out.println(getName() + " not flying.");
        }
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
