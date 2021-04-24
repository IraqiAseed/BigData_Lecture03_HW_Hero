package parent;

public abstract class Hero {

    protected int hit_points;
    protected int power;

    public Hero(int power, int hit_points) {
        this.power = power;
        this.hit_points = hit_points;
    }

    public boolean isAlive() {
        return (hit_points != 0);
    }

    public int getPower() {
        return power;
    }

    public int getHit_points() {
        return hit_points;
    }

    public void setHit_points(int hit_points) {
        this.hit_points = hit_points;
        if (this.hit_points < 0)
            this.hit_points = 0;
    }

    public void setPower(int power) {
        this.power = power;
        if (this.power < 0)
            this.power = 0;
    }

    public void kill() {
        setHit_points(0);
        setPower(0);    //if killed, will be powerless
    }

    public void decreasePower(int points_to_decrease) {
        setPower(this.power - points_to_decrease);
    }

    public void decreaseHit_points(int points_to_decrease) {
        setHit_points(hit_points - points_to_decrease);
    }

    public abstract void kick(Hero enemy);

}
