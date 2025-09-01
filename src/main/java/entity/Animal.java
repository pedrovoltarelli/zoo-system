package entity;

public class Animal {
    private String name;
    private String race;
    private int age;
    private String typeSexual;

    public Animal(String name, String race, int age, String typeSexual) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.typeSexual = typeSexual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeSexual() {
        return typeSexual;
    }

    public void setTypeSexual(String typeSexual) {
        this.typeSexual = typeSexual;
    }
}
