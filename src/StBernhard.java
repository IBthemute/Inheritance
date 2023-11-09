public class StBernhard extends Dog {
    public StBernhard() {
        super("StBernhard");
    }

    public void rescue(String thing) {
        if (carrying.equals("")) {
            System.out.println(name + " runs off and grabs " + thing);
            carrying = thing;
            System.out.println(name + " gives some brandy to " + thing);
        } else {
            System.out.println(name + " is already carrying " + carrying);
        }
    }
}
