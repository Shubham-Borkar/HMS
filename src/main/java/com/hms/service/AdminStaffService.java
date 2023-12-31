package com.hms.service;

import java.util.List;

import com.hms.dto.ApiResponse;
import com.hms.pojos.Entry;
import com.hms.pojos.Staff;

public interface AdminStaffService {

	ApiResponse addDoctor(Entry doctorDetails);

	ApiResponse addStaff(Entry staffDetails);

	void deleteStaff(int staffId);

	List<Staff> findAll();

	Staff updateStaff(Staff staff);

	Staff getstaffById(int staffId);

}
