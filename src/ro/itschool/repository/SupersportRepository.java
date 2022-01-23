package ro.itschool.repository;

import ro.itschool.pojo.SuperSport;

public class SupersportRepository {
    public static SuperSport[] getAllSuperSports() {
        SuperSport[] superSports = new SuperSport[6];
        String[] features = {"Traction control", "ABS", "Digital display"};
        superSports[0] = new SuperSport(1, 4999, "600RR", "HONDA", 2012, features);
        superSports[1] = new SuperSport(2, 4999, "R6", "YAMAHA", 2013, features);
        superSports[2] = new SuperSport(3, 4999, "ZX6R", "KAWASAKI", 2011, features);
        superSports[3] = new SuperSport(4, 4999, "GSRX - 600", "SUZUKI", 2010, features);
        superSports[4] = new SuperSport(5, 4999, "GSRX - 600", "SUZUKI", 2010, features);
        superSports[5] = new SuperSport(6, 4999, "GSRX - 600", "SUZUKI", 2010, features);

        return superSports;
    }
}
