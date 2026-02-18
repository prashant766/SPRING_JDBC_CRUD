package dao;

import model.Patient;

public interface PatientDao {
     int create(Patient patient);
     int update(Patient patient);
     int delete(int patientId);
}
