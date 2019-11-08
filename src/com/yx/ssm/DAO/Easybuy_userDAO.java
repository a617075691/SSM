package com.yx.SSM.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yx.SSM.entity.Easybuy_user;


public interface Easybuy_userDAO {
	public Easybuy_user get(@Param("zh")String zh,@Param("mm")String mm) throws Exception;
	public Integer insert(Easybuy_user user) throws Exception;
	public Integer getCount(String zh) throws Exception;
	public List<Easybuy_user> selectuser()throws Exception;
}
