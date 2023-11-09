public class Monkey extends Animal{
    private int standingLegs = 2;
    private int allFoursLegs = 4;
    private boolean standing;

    public Monkey (String name) {
        super(name, 4, "ooh ooh ahh ahh");
        standing = false;
    }

    public boolean toggleStanding() {
        if (standing == true) {
            standing = false;
            super.setLegs(allFoursLegs);
        }
        else {
            standing = true;
            super.setLegs(standingLegs);
        }
        return standing;
    }
}
