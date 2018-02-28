package DAOs.DaoInterface;

import Pojos.Appointment;
import Pojos.Doctor;
import Pojos.Patient;

import java.util.ArrayList;


public interface BookDAOInterface {
    ArrayList ViewAvailablePatients(Patient  p);
    ArrayList viewAvailableDoctors(Doctor D);
   int bookingDocAndPatient(Appointment appointment);
  Appointment viewBooking(Appointment appointment);

}
