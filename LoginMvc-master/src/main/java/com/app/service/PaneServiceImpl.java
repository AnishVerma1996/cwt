package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.UserDao;
import com.cwt.entity.PaneDetails;

public class PaneServiceImpl implements PaneService {
 @Autowired
 private UserDao userDao;
	@Override
	public void saveEmployee(PaneDetails paneDetails)
	{
		userDao.savePaneForm(paneDetails);
	
		
	}

}
