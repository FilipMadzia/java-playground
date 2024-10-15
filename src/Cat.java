public class Cat {
    private String name;
    private int age;

    public Cat(String _name, int _age) {
        name = _name;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) throws Exception {
        if(newName.equals("krystian")) {
            throw new Exception("GET OUT");
        }

        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws IllegalArgumentException {
        if(newAge < 0) {
            throw new IllegalArgumentException("The age cannot be smaller than 0");
        }

        age = newAge;
    }
}
