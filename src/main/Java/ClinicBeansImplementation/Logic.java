package ClinicBeansImplementation;

import ClinicBeansInterface.ClinicInterface;
import DAOs.DaoImplementation.DoctorsDAO;
import DAOs.DaoImplementation.PatientDAO;
import Pojos.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
@ApplicationScoped
@Named("Logic")

public class Logic implements ClinicInterface {
    public int registerPatient(Patient p) {


        return 0;
    }

    public int registerDoctor(Doctor doc) {

        return 0;
    }

    public int book(Patient p, Doctor doc) {
        return 0;
    }

    public int examine(Patient p, Doctor d, Result rst) {
        return 0;
    }

    public int labtest(Doctor d, Patient p, Result rst) {
        return 0;
    }

    public int prescribe(Patient p, Doctor doc, Medicine med) {
        return 0;
    }

    public int pay(Patient p, Transaction t) {
        return 0;
    }
}
