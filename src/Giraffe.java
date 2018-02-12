public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food){
        if(food.equals(super.favoriteFood)){
            super.eat(food);
            super.sleep();
        }else{
            System.out.print("YUCK!!! " + super.name + " will not eat " + food);
        }
    }
}
