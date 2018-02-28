package DAOs.DaoInterface;

import Pojos.Doctor;
import Pojos.Patient;
import Pojos.Result;

import java.util.ArrayList;

public interface ExaminationDAOInterface {
    boolean isResultRecorded(Patient p, Doctor doc, Result rst);
     ArrayList viewExaminationRecords(Patient p, Doctor doc, Result rst);

}
