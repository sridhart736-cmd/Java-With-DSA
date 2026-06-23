class Person {
    private String name;
    public void setName(String n) { name = n; }
    public String getName() { return name; }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Vino");
        System.out.println(p.getName());
    }
}