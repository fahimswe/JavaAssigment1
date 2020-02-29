
package UniversityadmissionSystem;

public class Address {
    String vill;
    String post_office;
    int post_code;
    String zila;
    String upozila;
    
    Address(){
        vill = "village";
        post_office = "post_office";
        post_code = 0000;
        zila = "zila";
        upozila = "upozila";
    }
    public Address(String v, String p, int c, String z, String u){
        this.vill = v;
        this.post_office = p;
        this.zila = z;
        this.post_code = c;
        this.upozila = u;
    }
    
    public void printaddress(){
        System.out.println("Address -");
        System.out.println(" Village name: " + vill);
        System.out.println(" Post office : " + post_office);
        System.out.println(" Zila        : " + zila);
        System.out.println(" Upozila     : " + upozila );
        System.out.println();
        
    }
}
