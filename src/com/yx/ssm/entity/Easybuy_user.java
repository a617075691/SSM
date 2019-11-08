package com.yx.SSM.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.yx.SSM.Validation.UserLogin;
import com.yx.SSM.Validation.UserRegist;

public class Easybuy_user {
	private int id;
	@NotEmpty(groups={UserLogin.class,UserRegist.class},message="账号不能为空！")
	private String loginName;
	@NotEmpty(groups={UserRegist.class},message="请输入姓名!")
	private String userName;
	@NotEmpty(groups={UserLogin.class,UserRegist.class},message="密码不能为空！")
	private String password;
	@NotEmpty(groups={UserRegist.class},message="请再次输入密码！")
	private String password2;
	@NotEmpty(groups={UserRegist.class},message="身份证号码不能为空!")
	private String identityCode;
	@NotEmpty(groups={UserRegist.class},message="邮箱不能为空!")
	private String email;
	@NotEmpty(groups={UserRegist.class},message="电话不能为空!")
	private String mobile;
	private int sex;
	private int type;
	public Easybuy_user() {
		super();
	}
	public Easybuy_user(String loginName, String userName,
			String password, int sex, String identityCode, String email,
			String mobile, int type) {
		super();
		this.loginName = loginName;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.identityCode = identityCode;
		this.email = email;
		this.mobile = mobile;
		this.type = type;
	}
	public Easybuy_user(int id,String loginName, String userName,
			String password, int sex, String identityCode, String email,
			String mobile, int type) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.identityCode = identityCode;
		this.email = email;
		this.mobile = mobile;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdentityCode() {
		return identityCode;
	}
	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
}
