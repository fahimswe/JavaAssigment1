
package UniversityadmissionSystem;

public class Registration {
    PersonalInfo info;
    Address address;
    AccademicInfo accademicinfo;
    
    Registration(){
        info = new PersonalInfo();
        address = new Address();
        accademicinfo = new AccademicInfo();
    }
    
    public Registration( PersonalInfo per , Address add ){
        this.info = per;
        this.address = add;
    }
    
    public void AccademicResult(AccademicInfo accademic){
        accademicinfo = accademic;
    }
 
    public void printdetails(){
        System.out.println("Your information: ");
        info.personaldetails();
        address.printaddress();
        accademicinfo.printaccadic();
    }
    
}
