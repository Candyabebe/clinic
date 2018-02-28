package DAOs.DaoImplementation;

import DAOs.DbUtil;
import Pojos.Appointment;
import Pojos.Doctor;
import Pojos.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookDAO implements DAOs.DaoInterface.BookDAOInterface {

    DbUtil db=new DbUtil();
   String sql;

    public  ArrayList ViewAvailablePatients(Patient  p) {
        sql="SELECT name FROM PatientRegistration";
        ResultSet rs=db.read(sql);
        ArrayList<String>names=new ArrayList<String>();
        try{
            while (rs.next()){
String Name=rs.getString("name");
                names.add(Name);

                }
        } catch(SQLException e){
                e.printStackTrace();
            }
            return names;
    }

    ArrayList viewAvailableDoctors(Doctor Doc){
        sql="SELECT name FROM DoctorRegistration";
        ResultSet rs=db.read(sql);
        ArrayList<String>DoctorsPresent=new ArrayList<String>();
        try{

            while (rs.next()){
                String Name=rs.getString("name");
                DoctorsPresent.add(Name);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return DoctorsPresent;
    }
    public int bookingDocAndPatient(Appointment appointment,Patient p,Doctor doc) {
        sql="SELECT Patient FROM Appointment WHERE ID="+p.getID();

        //sql="INSERT INTO Appointment PatientID,Patient,Doctor,Staffid VALUES('"+appointment.getP()+"','"+appointment.getD()+"')";
        return 0;
    }

    public Appointment viewBooking(Appointment appointment) {
        return null;
    }

}
