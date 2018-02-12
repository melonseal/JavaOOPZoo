public class Bear extends Animal {

    public Bear(String name){
        super(name, "fish");
    }

    public void sleep(){
        System.out.print(super.name + " hibernates for 4 months");
    }


    public static void main(String[] args){
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
