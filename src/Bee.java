public class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }

    public void sleep(){
        System.out.print(super.name + " never sleeps");
    }

    public void eat(String food){
        if(food.equals(super.favoriteFood)){
            super.eat(food);
            this.sleep();
        }else{
            System.out.print("YUCK!!! " + super.name + " will not eat " + food);
        }
    }

}
