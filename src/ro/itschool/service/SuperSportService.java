package ro.itschool.service;

import ro.itschool.pojo.SuperSport;
import ro.itschool.repository.SupersportRepository;

public class SuperSportService implements SuperSportInterface {
    private SuperSport[] superSports;

    public SuperSportService() {
        superSports = SupersportRepository.getAllSuperSports();
    }

    @Override
    public SuperSport[] getAllSuperSports() {
        return this.superSports;
    }

    @Override
    public void buySuperSport(int id) {
        boolean isBikeAvailable = false;
        for (int i = 0; i < this.superSports.length; i++) {
            if (superSports[i] != null && superSports[i].getId() == id) {
                System.out.println("Ati cumparat motocicleta " + superSports[i]);
                isBikeAvailable = true;
                superSports[i] = null;
            }
        }
        if (!isBikeAvailable)
            System.out.println("Id-ul introdus este gresit");
    }

    @Override
    public void buyBackSuperSport(SuperSport superSport) {
        for (int i = 0; i < this.superSports.length; i++) {
            if (superSports[i] == null) {
                superSports[i] = superSport;
                break;
            }
        }
    }
}
