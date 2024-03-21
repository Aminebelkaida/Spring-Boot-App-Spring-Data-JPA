package ma.iibdcc.tpormjpa.repository;

import ma.iibdcc.tpormjpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
