package com.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.pojos.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
