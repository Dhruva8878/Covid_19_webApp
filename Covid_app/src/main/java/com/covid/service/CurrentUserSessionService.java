package com.covid.service;

import java.util.Optional;

import com.covid.model.CurrentUserSession;

public interface CurrentUserSessionService {
	
	public Optional<CurrentUserSession> getSessionIdByUserId(Integer key);
	
	public Optional<CurrentUserSession> getdetailsByuuid(String key);

}
