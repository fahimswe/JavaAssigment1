
package UniversityadmissionSystem;

public class SSCinfo {
    int passing_year;
    float result;
    String board;
    
    SSCinfo(){
        passing_year = 2018;
        result = 5.00f;
        board = "board";
    }
    public SSCinfo( int p, float r, String s ){
        this.passing_year = p;
        this.result = r;
        this.board = s;
    }
}
