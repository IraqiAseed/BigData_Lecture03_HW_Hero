package parent;

public abstract class Hero {

    protected int hitPoints;
    protected int power;

    public Hero(int power, int hitPoints) {
        this.power = power;
        this.hitPoints = hitPoints;
    }

    public boolean isAlive() {
        return (hitPoints != 0);
    }

    public int getPower() {
        return power;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
        if (this.hitPoints < 0)
            this.hitPoints = 0;
    }

    public void setPower(int power) {
        this.power = power;
        if (this.power < 0)
            this.power = 0;
    }

    public void kill() {
        setHitPoints(0);
        setPower(0);    //if killed, will be powerless
    }

    public void decreasePower(int pointsToDecrease) {
        setPower(this.power - pointsToDecrease);
    }

    public void decreaseHitPoints(int pointsToDecrease) {
        setHitPoints(hitPoints - pointsToDecrease);
    }

    public abstract void kick(Hero enemy);

}
