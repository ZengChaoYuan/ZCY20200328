package com.zcy.bean;

import java.sql.Date;

public class AdminInfo {//后台用户表
	private Long adminId;
	private String adminName;
	private String adminPwd;
	private Long adminStatus;
	private Date adminCtime;
    private Long roleId;
    
	public AdminInfo(Long adminId, String adminName, String adminPwd, Long adminStatus, Date adminCtime, Long roleId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminStatus = adminStatus;
		this.adminCtime = adminCtime;
		this.roleId = roleId;
	}

	public AdminInfo() {
		super();
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public Long getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(Long adminStatus) {
		this.adminStatus = adminStatus;
	}

	public Date getAdminCtime() {
		return adminCtime;
	}

	public void setAdminCtime(Date adminCtime) {
		this.adminCtime = adminCtime;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
    
}
