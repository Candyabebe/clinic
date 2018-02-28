package DAOs.DaoInterface;

import Pojos.Doctor;

public interface DoctorDAOInterfce {
    Boolean doctorRegistration(Doctor doc);
     Boolean isDoctorRegistered(Doctor doc);
     Doctor viewDoctor(Doctor doc);

}
