package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Egg6 {
    private Needle7 nb;
    public Egg6(Needle7 nb){
        this.nb = nb;
    }
    @Autowired
    public void setNb(Needle7 nb){
        this.nb = nb;
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + nb.toString();
    }

}
