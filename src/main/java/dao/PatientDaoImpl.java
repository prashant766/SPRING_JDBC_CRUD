package dao;

import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDaoImpl implements PatientDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

   @Override
    public int create(Patient patient){

        String query="INSERT INTO HOSPITALS(PATIENT_ID,PATIENT_NAME,PATIENT_HEALTH,PATIENT_CITY) VALUES(?,?,?,?)";

        return jdbcTemplate.update(
                query,
                patient.getPatientId(),
                patient.getPatientName(),
                patient.getPatientHealth(),
                patient.getPatientCity()
        );
    }

    @Override
    public int update(Patient patient){

        String query="UPDATE HOSPITALS SET PATIENT_NAME=?, PATIENT_HEALTH=?, PATIENT_CITY=? WHERE PATIENT_ID=?";
        return jdbcTemplate.update(
                query,
                patient.getPatientName(),
                patient.getPatientHealth(),
                patient.getPatientCity(),
                patient.getPatientId()   // NUMBER goes LAST
        );
    }

    @Override
    public int delete(int patientId){

        String query="DELETE FROM HOSPITALS WHERE PATIENT_ID=?";
        return  jdbcTemplate.update(query,patientId);
    }


}
