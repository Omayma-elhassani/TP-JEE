package net.omayma.ext;

import net.omayma.dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.printf("Version capteurs ....");
        double t = 12;
        return t;
    }
}
