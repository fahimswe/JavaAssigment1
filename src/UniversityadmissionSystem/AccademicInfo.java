
package UniversityadmissionSystem;

public class AccademicInfo {
    SSCinfo sscinfo;
     HSCinfo hscinfo;
    
    AccademicInfo(){
        sscinfo = new SSCinfo();
        hscinfo = new HSCinfo();
    }
    public AccademicInfo( SSCinfo s, HSCinfo h ){
        this.hscinfo = h;
        this.sscinfo = s;
    }
    
    public void printaccadic(){
        System.out.println("Accademic info -");
        System.out.println(" SSC info:");
        System.out.println(" Passing year: " + sscinfo.passing_year);
        System.out.println("     GPA     : " + sscinfo.result);
        System.out.println("     Board   : " + sscinfo.board);
        System.out.println();
        System.out.println(" HSC info:");
        System.out.println(" Passing year: " + hscinfo.passing_year);
        System.out.println("     GPA     : " + hscinfo.result);
        System.out.println("     Board   : " + hscinfo.board);
        

        
    }
    
}
