package com.hms.service;

import java.util.List;
import java.util.Optional;

import com.hms.dto.ApiResponse;
import com.hms.dto.PatientRegDto;
import com.hms.pojos.Entry;
import com.hms.pojos.Patient;



public interface PatientService {
	ApiResponse registerPatient(PatientRegDto patientDetails);

	List<Patient> getAllPatients();

	Optional<Patient> getPatientById(int id);

	Patient updatePatient(Patient patient);
}
