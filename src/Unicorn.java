public class Unicorn extends Animal{

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(){
        System.out.print(super.name + " sleeps in a cloud.");
    }

}
