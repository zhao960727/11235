package com.zyf.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyf.dao.GsDao;
import com.zyf.entity.Gongsi;
import com.zyf.utils.DateUtil;
import com.zyf.utils.IOUtils;
import com.zyf.utils.StringUtil;

public class GsTest {
	
	public static void main(String[] args) {
		
		ApplicationContext aic=new ClassPathXmlApplicationContext("ab.txt");
		GsDao dao = aic.getBean(GsDao.class);
		
			List<Object[]> list = IOUtils.readFile("ab.txt","\t");
			
			for (Object[] objects : list) {
				if(StringUtil.isNumber(objects[0]+"") && StringUtil.isEmpty(objects[1]+"") && StringUtil.isEmpty(objects[2]+"") && StringUtil.isEmpty(objects[3]+"")&& StringUtil.isEmpty(objects[4]+"")){
					Gongsi gs=new Gongsi(Integer.parseInt(objects[0]+""),objects[1]+"",objects[2]+"",objects[3]+"",objects[4]+"",objects[5]+"",objects[6]+"",objects[7]+"",objects[8]+"");         
					dao.addGs(gs);
				}
			}
	}
}
