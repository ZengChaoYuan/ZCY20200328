package com.zcy.service;

import java.sql.Connection;


import com.zcy.bean.AdminInfo;
import com.zcy.dao.AdminInfoDao;
import com.zcy.util.DBUtil;
import com.zcy.util.DaoFactory;


public class AdminInfoServiceImpl implements AdminInfoService {

	@Override
	public AdminInfo login(String name, String pwd) {
		Connection conn=DBUtil.getConnection();
		AdminInfoDao info=(AdminInfoDao)DaoFactory.getDaoImpl(AdminInfoDao.class.getName());
		return info.selectAdmin(conn,name, pwd);
	}

	

}
