package ClinicBeansImplementation;

import ClinicBeansInterface.DoctorBeanInterface;
import DAOs.DaoImplementation.DoctorsDAO;
import Pojos.Doctor;

public class DoctorBean implements DoctorBeanInterface {
    public int registerDoctor(Doctor doc) {
        DoctorsDAO regDoct=new DoctorsDAO();
        regDoct.doctorRegistration(doc);
        return 0;
    }

    public Doctor DisplayRegisteredDoctros(Doctor doc) {
        DoctorsDAO Dd=new DoctorsDAO();
        Dd.viewDoctor(doc);
        return null;
    }
}
