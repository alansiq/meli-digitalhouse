package exercicio2.model;

import exercicio2.interfaces.Printable;

import java.util.ArrayList;

public class Curriculo implements Printable {
    private String fullName;
    private int age;
    private String address;
    private ArrayList<String> skillset = new ArrayList<>();

    public Curriculo(String fullName, int age, String address, ArrayList<String> skillset) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.skillset = skillset;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", skillset=" + skillset +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(ArrayList<String> skillset) {
        this.skillset = skillset;
    }
}
