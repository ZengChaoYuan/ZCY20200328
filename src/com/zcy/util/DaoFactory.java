package com.zcy.util;

import java.util.HashMap;
import java.util.Map;

import com.zcy.dao.AdminInfoDao;
import com.zcy.dao.AdminInfoDaoImpl;


public class DaoFactory {
	 
		private static Map<String,Object> config=new HashMap<String,Object>();
		
		static {
			config.put(AdminInfoDao.class.getName(),new AdminInfoDaoImpl());
		}
		
		public static Object getDaoImpl(String name) {
			return config.get(name);
		}
}
