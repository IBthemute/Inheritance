public class Monkey extends Animal{
    private int standingLegs = 2;
    private int allFoursLegs = 4;
    private boolean standing;

    public Monkey (String name) {
        super(name, 4, "ooh ooh ahh ahh");
        standing = false;
    }

    public int getLegs() {
        int legs = allFoursLegs;
        if (standing) {legs = standingLegs;}
        return legs;
    }

    public boolean toggleStanding() {
        if (standing == true) {standing = false;}
        else {standing = true;}
        return standing;
    }
}
