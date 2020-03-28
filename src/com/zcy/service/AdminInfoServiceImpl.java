package com.zcy.service;

import java.sql.Connection;

import com.zcy.bean.AdminInfo;
import com.zcy.dao.AdminInfoDaoImpl;
import com.zcy.util.DBUtil;

public class AdminInfoServiceImpl implements AdminInfoService {

	@Override
	public AdminInfo login(String name, String pwd) {
		Connection conn=DBUtil.getConnection();
		AdminInfoDaoImpl impl=new AdminInfoDaoImpl();
		
		return null;
	}

}
