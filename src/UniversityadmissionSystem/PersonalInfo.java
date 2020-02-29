package UniversityadmissionSystem;

public class PersonalInfo {

    String name;
    String Parentname;
    int age;

    PersonalInfo() {
        name = "name";
        Parentname = "Parent_name";
        age = 10;
    }

    public PersonalInfo(String n, String p, int a) {
        this.name = n;
        this.Parentname = p;
        this.age = a;
    }

    public void personaldetails() {
        System.out.println("Personal information: ");
        System.out.println(" Name        : " + name);
        System.out.println(" Father name : " + Parentname);
        System.out.println(" Age         : " + age + " year");
        System.out.println();
    }
}
