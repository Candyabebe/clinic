package DAOs.DaoImplementation;

import DAOs.DaoInterface.DoctorDAOInterfce;
import DAOs.DbUtil;
import Pojos.Doctor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorsDAO implements DoctorDAOInterfce {
    DbUtil db=new DbUtil();
    String sql;

    public Boolean isDoctorRegistered(Doctor doc) {
        sql = "SELECT * FROM DoctorRegistration WHERE ID="+doc.getStaffid();
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
    public Boolean doctorRegistration(Doctor doc) {
        if(isDoctorRegistered(doc)){
            sql="INSERT INTO DoctorRegistration(Fname,Lname,Staffid,phonenumber,Gender) VALUES('"+doc.getFname()+"','"+doc.getLname()+"','"+doc.getStaffid()+"','"+doc.getPhonenumber()+"','"+doc.getGender()+"')";
            int a= db.write(sql);
            if(a>0){
                return true;
            } else
                return false;
        }
        return false;
    }




    public Doctor viewDoctor(Doctor doc) {
        Doctor d=new Doctor();
        sql="SELECT * FROM DoctorRegistration WHERE Staffid="+doc.getStaffid();
        ResultSet rs=null;
        try{
            while(rs.next()) {
                doc.setFname(rs.getString("Fname"));
                doc.setLname(rs.getString("Lname"));
                doc.setStaffid(rs.getInt("Staffid"));
                doc.setPhonenumber(rs.getLong("phonenumber"));
                doc.setGender(rs.getString("Gender"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }


        return doc;
    }
}
