
package UniversityadmissionSystem;

public class Main {
    public static void main(String[] argu){
        
        PersonalInfo fahiminfo = new PersonalInfo("Fahim", "Sariful islam", 20);
        Address fahimaddress = new Address("Boktiyarfur", "Hazirhat", 5400, "Rangpur", "Sadar");
        SSCinfo fahimssc = new SSCinfo(2015, 5.00f, "Madrasha");
        HSCinfo fahimhsc = new HSCinfo (2017, 5.00f, "Dinajpur");
        
        AccademicInfo fahimaccadic = new AccademicInfo(fahimssc, fahimhsc);
        
        Registration fahim = new Registration( fahiminfo , fahimaddress );
        fahim.AccademicResult(fahimaccadic);
        fahim.printdetails();
        
        System.out.println();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
