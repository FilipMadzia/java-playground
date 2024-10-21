public class Cat extends Animal {
    public Cat(int _age, String _name) {
        super(_age, _name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": meow");
    }
}
