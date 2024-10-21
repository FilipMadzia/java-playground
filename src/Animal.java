public abstract class Animal {
    int age;
    String name;

    public Animal(int _age, String _name) {
        age = _age;
        name = _name;
    }

    public abstract void makeSound();
}
