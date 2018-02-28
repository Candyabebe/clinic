package ClinicBeansImplementation;

import ClinicBeansInterface.PatientBeanInterface;
import DAOs.DaoImplementation.PatientDAO;
import Pojos.Patient;

public class PatientBean implements PatientBeanInterface{
    public int registerPatient(Patient p) {
        PatientDAO rp=new PatientDAO();
        rp.patientRegistration(p);
        return 0;
    }

    public Patient displayRegisterdPatient(Patient P) {
        PatientDAO pd=new PatientDAO();
        pd.viewPatient(P);
        return null;
    }
}
