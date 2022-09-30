package com.covid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.enums.Slot;
import com.covid.exception.AppoinmentException;
import com.covid.model.Appoinment;
import com.covid.model.CurrentUserSession;
import com.covid.repo.AppoinmentDAO;
import com.covid.repo.MemberDAO;
import com.covid.repo.VaccinationCenterDAO;


@Service
public class AppoinmentServiceImpl implements AppoinmentService{

	@Autowired
	public MemberDAO memberDAO;
	
	@Autowired
	public CurrentUserSession currentUserSession;
	
	@Autowired
	public VaccinationCenterDAO vaccinationCenterDAO;
	
	@Autowired
	public AppoinmentDAO appoinmentDAO;
	
	public Slot slot;
	
	@Override
	public List<Appoinment> getAllAppoinments() {
		
		List<Appoinment> app= appoinmentDAO.findAll();
		
		return app;
	}

	@Override
	public Appoinment getAppoinment(Integer bookingId) {
			
		
		return null;
	}

	@Override
	public Appoinment addAppoinment(Appoinment app) {
		
		Optional<Appoinment> appoint= appoinmentDAO.findById(app.getBookingId());
		
		
		return null;
	}

	@Override
	public Appoinment updateAppoinment(Appoinment app) throws AppoinmentException {
		
		Optional<Appoinment> appoint=appoinmentDAO.findById(app.getBookingId());
		
		if(appoint.isPresent()) {
			
			appoinmentDAO.save(app);
			
			return appoint.get();
		}
		else {
			throw new AppoinmentException("No Appoinment found");
		}
	}

	@Override
	public boolean deleteAppoinment(Appoinment app) throws AppoinmentException {
		
        Optional<Appoinment> appoint= appoinmentDAO.findById(app.getBookingId());		
		
        if(appoint.isPresent()) {
        	
        	appoinmentDAO.delete(app);
        	return true;
        }
        else {
        	throw new AppoinmentException("user does not have any appoinment");
        }
	}
	
	

}
