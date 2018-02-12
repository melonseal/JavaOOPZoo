public class Animal {
    static int population = 0;
    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population += 1;
    }

    public int populationCount(){
        return population;
    }

    public void sleep(){
        System.out.print(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.print(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.print("YUM!!! " + this.name + " wants more " + food);
        }else{
            this.sleep();
        }
    }

}
