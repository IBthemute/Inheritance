public class Animal {
    protected String name;
    private int legs;
    private String sound;


    public Animal(String name, int legs, String sound) {
        this.name = name;
        this.legs = legs;
        this.sound = sound;
    }


    public void say(String words) {
        System.out.println(name + " says " + sound);
    }

    public int getLegs() {
        return legs;
    }

    public int setLegs(int legs) {
        this.legs = legs;
        return legs;
    }
}
