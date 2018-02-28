package DAOs.DaoImplementation;

import DAOs.DaoInterface.PatientDAOInterface;
import DAOs.DbUtil;
import Pojos.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO implements PatientDAOInterface {
    DbUtil db=new DbUtil();
    String sql;
    public boolean patientRegistration(Patient p) {

        if(isPatientRegistered(p)){
            sql="INSERT INTO PatientRegistration(name,gender,age,date,ID) VALUES('"+p.getName()+"','"+p.getGender()+"','"+p.getAge()+"','"+p.getDate()+"','"+p.getID()+"')";
            int a= db.write(sql);
            if(a>0){
                return true;
            } else
                return false;
        }
       return false;
    }

    public boolean isPatientRegistered(Patient p) {

        sql = "SELECT * FROM PatientRegistration WHERE ID="+p.getID();
        ResultSet rs = db.read(sql);
        boolean status=false;
        try {
            if(rs.next()){
                status=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
    public Patient viewPatient(Patient p) {
        Patient pa=new Patient();
        ResultSet rs=null;
        sql = "SELECT * FROM PatientRegistration WHERE ID="+p.getID();
        try{
            while (rs.next()){
                pa.setName(rs.getString("Name"));
                pa.setGender(rs.getString("Gender"));
                pa.setAge(rs.getInt("Age"));
                pa.setDate(rs.getDate("Date"));
                pa.setID(rs.getInt("ID"));

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    return pa;
    }

}
