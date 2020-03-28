package com.zcy.util;

import java.util.HashMap;
import java.util.Map;
import com.zcy.service.AdminInfoService;
import com.zcy.service.AdminInfoServiceImpl;

public class ServiceFactory {
	private static Map<String,Object> config=new HashMap<String,Object>();
    static {
    	config.put(AdminInfoService.class.getName(), new AdminInfoServiceImpl());
    }
    public static Object getServiceImpl(String name) {
    	return config.get(name);
    }
}


