
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    @Override 
    public boolean equals(Object o){
        if (o == null) return false ;
        if (this==o) return true ;
        if (o instanceof LicensePlate){
            final LicensePlate ob = (LicensePlate) o ;
            if (this.country.equals(ob.country) && this.liNumber==ob.liNumber) return true ;
            
        }
        return false ;
    }
    
    @Override 
    public int hashCode(){
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    

}
