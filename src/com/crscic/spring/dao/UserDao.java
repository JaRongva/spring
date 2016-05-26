package com.crscic.spring.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crscic.spring.entity.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public void add(User u){
		hibernateTemplate.save(u);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
