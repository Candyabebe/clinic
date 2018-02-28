package ClinicBeansImplementation;

import ClinicBeansInterface.BookBeanInterface;
import DAOs.DaoImplementation.BookDAO;

import java.util.ArrayList;

public class BookBean implements BookBeanInterface {
    public ArrayList<String> viewAvailableDoctors() {
        BookDAO bd=new BookDAO();
        bd.bookPatient(p);
        return null;
    }

    public ArrayList<String> viewAvailablePatients() {
        return null;
    }
}
