public class Animal {
    private int hunger ;
    private int thirst ;

    public Animal(int hunger, int thirst) {
        this.thirst = thirst;
        this.hunger = hunger;
    }

    public int eat() {
        return (hunger - 1);
    }

    public int drink() {
        return (thirst - 1);
    }

    public int play() {
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.drink());
    }
}