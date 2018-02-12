import java.util.ArrayList;
import java.util.Arrays;

public class runner {

//    public static void main(String[] args){
//        AnotherExampleClass instanceOne = new AnotherExampleClass("What does your counter say? ");
//        AnotherExampleClass instanceTwo = new AnotherExampleClass("That can't be! It says...it's...");
//        instanceOne.increaseAndCheckTheCounter();
//        instanceTwo.increaseAndCheckTheCounter();
//    }



    public static void main(String[] args){
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<Animal>(
                Arrays.asList(tigger, pooh, rarity, gemma, stinger)
        );
        zoebot.feedAnimals(animals, "chocolate");
    }

//    public static void main(String[] args){
//        ExampleSuperclass sup = new ExampleSuperclass("Hello student.");
//        ExampleSubclass sub = new ExampleSubclass("Hi there student. Want to hear a secret?");
//        sup.doStuff();
//        sub.doStuff();
//        sup.sayGoodbye();
//        sub.sayGoodbye();
//    }



}
