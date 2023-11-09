class Main {
    public static void main(String[] args) {
        System.out.println("Animal crackers");
        Cow daisy = new Cow("Daisy");
        daisy.milk();
        daisy.say("hello");


        Dog spot = new Dog("Spot");
        spot.say("hello");
        spot.fetch("stick");
        spot.fetch("banana");
        spot.drop();
        spot.drop();

        Monkey aMonkey = new Monkey("A monkey");
        System.out.println(aMonkey.getLegs());
        System.out.println(aMonkey.toggleStanding());
        System.out.println(aMonkey.getLegs());
        System.out.println(aMonkey.toggleStanding());
        System.out.println(aMonkey.getLegs());

        Animal[] animals = new Animal[4];
        animals[0] = new Cow("Alice");
        animals[1] = new StBernhard("Bob");
        animals[2] = new Cow("Clara");
        animals[3] = new Monkey("Dunston");

        for (int i = 0; i < animals.length; i++) {
            animals[i].say("test");
        }
    }
}
