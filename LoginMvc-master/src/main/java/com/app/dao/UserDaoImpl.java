package com.app.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.UserDetails;
import com.cwt.entity.PaneDetails;
import com.cwt.entity.PaneSectionDetails;
@Repository
public class UserDaoImpl implements UserDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	/*public List<UserDetails> getUserDetails() {
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		return criteria.list();
	}*/
	
	@Override
	public void savePaneForm(PaneDetails paneDetails ) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=(Transaction) session.beginTransaction();
		PaneSectionDetails paneSectionDetails1=new PaneSectionDetails();
		
		
		
		
		
		
		long saveId=(long)session.save(paneDetails);
		System.out.println("========================="+saveId);
		
		paneSectionDetails1.setSection_ID("SSE"+saveId);
		
		
	
}
}
