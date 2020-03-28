package com.zcy.dao;

import java.sql.Connection;

import com.zcy.bean.AdminInfo;

public interface AdminInfoDao {
   AdminInfo selectAdmin(Connection conn,String adminName,String adminPwd);
}
