package human;

public class Human {

    String firstName;
    String secondName;
    String lastName;
    int age;

    public Human() {
    }

    public Human(String firstName, String secondName, String lastName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "FIO: " + getLastName() + " " + getFirstName() + " " + getSecondName() + ". AGE: " + getAge() + " year(s).";
    }

    /*public static void main(String[] args) {
        //Human man = new Human("Ivanov", "Ivanovich", "Ivan", 33);
        //Human woman = new Human();
        //woman.setFirstName("Julia");
        //woman.setSecondName("Sergeevna");
        //woman.setLastName("Smirnova");
        //woman.setAge(89);
        //System.out.println(man);
        //System.out.println(woman);
    }*/

}
