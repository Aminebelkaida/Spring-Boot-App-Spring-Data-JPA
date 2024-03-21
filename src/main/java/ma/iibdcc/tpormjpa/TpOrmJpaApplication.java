package ma.iibdcc.tpormjpa;

import ma.iibdcc.tpormjpa.entities.Patient;
import ma.iibdcc.tpormjpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TpOrmJpaApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpOrmJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Ahmed", new Date(),true, 100));
        patientRepository.save(new Patient(null,"Nour", new Date(),false, 150));
        patientRepository.save(new Patient(null,"Samir", new Date(),true, 170));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p->{
            System.out.println(p.toString());

        });
        Patient patient=patientRepository.findById(Long.valueOf(2)).get();
        System.out.println("******************");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateNaissance());
        System.out.println(patient.getScore());
        System.out.println("******************");

    }
}
