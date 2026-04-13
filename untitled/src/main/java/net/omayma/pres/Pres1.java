package net.omayma.pres;

import net.omayma.dao.DaoImpl;
import net.omayma.ext.DaoImplV2;
import net.omayma.metier.MetierImpl;

public interface Pres1 {
    public static void main(String[] args){
        DaoImplV2 d= new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res= " +metier.calcul());
    }

}
