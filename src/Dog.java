public class Dog extends Animal {
    public Dog(int _age, String _name) {
        super(_age, _name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": bark");
    }
}
