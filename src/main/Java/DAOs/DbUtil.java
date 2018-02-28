package DAOs;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.jws.WebService;
import java.sql.*;
@ApplicationScoped
@Named ("DbUtil")

public class DbUtil {

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String URL = "jdbc:mysql://localhost/webschool";
        static final String user= "root";
        static final String password = "adminsm";
        Connection conn = null;
        Statement stmt = null;

        public DbUtil()  {
            connect();
        }
        public void connect(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.conn = DriverManager.getConnection(URL, user, password);
                //conn.setAutoCommit(false);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public ResultSet read(String sql){
            ResultSet rs = null;
            try {

                this.stmt = conn.createStatement();

                rs = stmt.executeQuery(sql);
            } catch (SQLException e) {
                e.getMessage();
                e.printStackTrace();
            } catch (Exception e){
                e.getMessage();
                e.printStackTrace();
            }

            return rs;
        }

        public int write(String sql){
            int k=0;
            try {
                this.stmt = conn.createStatement();
                k = stmt.executeUpdate(sql);
            } catch (SQLException e) {
                e.getMessage();
                e.printStackTrace();
            } catch (Exception e){
                e.getMessage();
                e.printStackTrace();
            }

            return k;
        }

        public void cleanUp(ResultSet rs) {
            try{
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }finally {
                try {
                    if (stmt!=null){
                        stmt.close();
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
                try {
                    if (conn!=null){
                        conn.close();
                    }
                } catch (SQLException e3) {
                    e3.printStackTrace();
                }
            }

        }
        public void cleanUp()  {
            try{
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }finally {
                try {
                    if (stmt!=null){
                        stmt.close();
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
                try {
                    if (conn!=null){
                        conn.close();
                    }
                } catch (SQLException e3) {
                    e3.printStackTrace();
                }
            }

        }

    }


