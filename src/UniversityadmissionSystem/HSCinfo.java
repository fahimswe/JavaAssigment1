
package UniversityadmissionSystem;


public class HSCinfo {
    int passing_year;
    float result;
    String board;
    
    HSCinfo(){
        passing_year = 2017;
        result = 5.00f;
        board = "board";
    }
    
    public HSCinfo(int p, float f, String s){
       this.passing_year = p;
       this.result = f;
       this.board = s;
    }
}
