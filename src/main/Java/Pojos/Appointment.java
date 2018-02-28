package Pojos;

public class Appointment {
    Patient p;
    Doctor d;

    public Appointment() {
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public Doctor getD() {
        return d;
    }

    public void setD(Doctor d) {
        this.d = d;
    }
}
