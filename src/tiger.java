public class tiger extends Animal{

    public tiger(String name){
        super(name, "meat");
    }

    public static void main(String[] args){
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }


}
