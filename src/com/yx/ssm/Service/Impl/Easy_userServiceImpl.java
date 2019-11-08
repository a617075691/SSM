package com.yx.SSM.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.yx.SSM.DAO.Easybuy_userDAO;
import com.yx.SSM.Service.Easy_userService;
import com.yx.SSM.entity.Easybuy_user;

@Service
public class Easy_userServiceImpl implements Easy_userService {
	
	@Autowired
	private Easybuy_userDAO dao;
	
	
	public Easybuy_userDAO getDao() {
		return dao;
	}


	public void setDao(Easybuy_userDAO dao) {
		this.dao = dao;
	}


	public Easybuy_user UserLogin(String zh,String mm) throws Exception{
		Easybuy_user user = dao.get(zh, mm);
		return user;
	}
	
	
	public boolean insertuser(Easybuy_user user) throws Exception{
		int count = dao.insert(user);
		if(count==1){
			return true;
		}
		return false;
	}
	
	public Integer getcount(@RequestParam("zh")String zh) throws Exception{
		return dao.getCount(zh);
	}


	public List<Easybuy_user> queryuser() throws Exception {
		return dao.selectuser();
	}
}
