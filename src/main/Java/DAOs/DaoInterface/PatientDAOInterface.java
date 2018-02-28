package DAOs.DaoInterface;

import Pojos.Patient;

public interface PatientDAOInterface {
    boolean patientRegistration(Patient p);
    boolean isPatientRegistered(Patient p);
    Patient viewPatient(Patient p);
}
