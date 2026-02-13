package Week12;

public class Student {

    private String name;
    private int age;

    public Student(String passedName, int passedAge){
        this.name = passedName;
        this.age = passedAge;
    }

    public String getNAme(){
        return this.name;
    }
}
