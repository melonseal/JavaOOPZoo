public class tiger {
    String name;
    String favoriteFood;

    public tiger(String name){
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(){
        System.out.print(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.print(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.print("YUM!!! " + this.name + " wants more " + food);
        }else{
            sleep();
        }
    }

    public static void main(String[] args){
        tiger tigger = new tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }


}
