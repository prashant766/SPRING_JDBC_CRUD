package model;

public class Patient {
    private int patientId;
    private String patientName;
    private String patientHealth;
    private String patientCity;

    public Patient(int patientId,String patientName,String patientHealth,String patientCity){
        this.patientId=patientId;
        this.patientName=patientName;
        this.patientHealth=patientHealth;
        this.patientCity=patientCity;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientHealth() {
        return patientHealth;
    }

    public void setPatientHealth(String patientHealth) {
        this.patientHealth = patientHealth;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }
}
