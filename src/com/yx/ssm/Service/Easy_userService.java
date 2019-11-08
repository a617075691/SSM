package com.yx.SSM.Service;

import java.util.List;

import com.yx.SSM.entity.Easybuy_user;


public interface Easy_userService {
	
	public Easybuy_user UserLogin(String zh,String mm) throws Exception;
	public Integer getcount(String zh) throws Exception;
	public boolean insertuser(Easybuy_user user) throws Exception;
	public List<Easybuy_user> queryuser()throws Exception;
}
