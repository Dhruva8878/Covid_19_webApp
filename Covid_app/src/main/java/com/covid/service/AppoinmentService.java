package com.covid.service;

import java.util.List;

import com.covid.exception.AppoinmentException;
import com.covid.model.Appoinment;

public interface AppoinmentService {
	
	public List<Appoinment> getAllAppoinments();
	
	public Appoinment getAppoinment(Integer bookingId);
	
	public Appoinment addAppoinment(Appoinment app);
	
	public Appoinment updateAppoinment(Appoinment app) throws AppoinmentException;
	
	public boolean deleteAppoinment(Appoinment app) throws AppoinmentException;

}
