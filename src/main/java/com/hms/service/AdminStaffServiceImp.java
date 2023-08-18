package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.dao.DoctorDao;
import com.hms.dao.EntryDao;
import com.hms.dao.PatientDao;
import com.hms.dao.StaffDao;
import com.hms.dto.ApiResponse;
import com.hms.pojos.Doctor;
import com.hms.pojos.Entry;
import com.hms.pojos.Staff;


@Service
public class AdminStaffServiceImp implements AdminStaffService {
	@Autowired
	private StaffDao sDao;
	@Autowired
	private PatientDao pDao;
	@Autowired
	private DoctorDao dDao;
	@Autowired
	private EntryDao lDao;
	
	@Override
	public ApiResponse addDoctor(Entry doctorDetails) {
		Staff staff = sDao.save(doctorDetails.getStaff());
		doctorDetails.setStaff(staff);
		doctorDetails.getDoctor().setStaff(staff);
		Doctor doc = dDao.save(doctorDetails.getDoctor());
		doctorDetails.setDoctor(doc);
		//sDao.save(doctorDetails.getDoctor().getStaff());
		
		lDao.save(doctorDetails);
		//entry.setStaff(doctorDetails.getDoctor().getStaff());
		//return "Doctor Details are added Successfully";
		return null;
	}

	@Override
	public ApiResponse addStaff(Entry staffDetails) {
		 sDao.save(staffDetails.getStaff());
		 lDao.save(staffDetails);
		return null;
	}

	@Override
	public void deleteStaff(int staffId) {
		sDao.deleteById(staffId);

	}

	@Override
	public List<Staff> findAll() {
		return sDao.findAll();
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return sDao.save(staff);
	}

	@Override
	public Staff getstaffById(int staffId) {
		// TODO Auto-generated method stub
		return sDao.findById(staffId).orElse(null);
	}

}
