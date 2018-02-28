package ClinicBeansInterface;

import Pojos.*;

public interface ClinicInterface {
    int registerPatient(Patient p);
    int registerDoctor(Doctor doc);
    int book(Patient p,Doctor doc );
    int examine(Patient p,Doctor d,Result rst);
    int labtest(Doctor d,Patient p,Result rst);
    int prescribe(Patient p, Doctor doc, Medicine med);
    int pay(Patient p, Transaction t);
}
