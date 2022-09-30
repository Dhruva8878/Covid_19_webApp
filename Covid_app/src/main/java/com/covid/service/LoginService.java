package com.covid.service;

import com.covid.model.LoginData;

public interface LoginService {

   public String loginAccount(LoginData loginData);
   
   public String logOutAccount(LoginData loginData,String Uuid);
}
