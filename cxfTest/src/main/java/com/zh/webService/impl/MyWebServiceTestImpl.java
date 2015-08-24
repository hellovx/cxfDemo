package com.zh.webService.impl;

import java.io.IOException;

import javax.jws.WebService;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.zh.model.User;
import com.zh.webService.MyWebServiceTest;

//@Component("myWebServiceTestImpl")
@Component("myWebServiceTestImpl")
public class MyWebServiceTestImpl implements MyWebServiceTest {

	public String queryParam(String name) {
		// TODO Auto-generated method stub
		System.out.println("WebServiceImpl-->queryParam-->name:"+name);
		

		User u=new User();
		u.setId("111");
		u.setName("你好");
		u.setInfo("infoinfoinfo");
		
		if("".equals(name)){
			u.setName(name);
		}
		
		String user = null;
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		try {
			user=mapper.writeValueAsString(u);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return user;
	}

	@Override
	public String pathParam(String name) {
		
		System.out.println("WebServiceImpl-->pathParam-->name:"+name);
		
		User u=new User();
		u.setId("111");
		u.setName("你好");
		u.setInfo("infoinfoinfo");
		
		if(!"".equals(name)){
			u.setName(name);
		}
		
		String user = null;
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		try {
			user=mapper.writeValueAsString(u);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return user;
		
	}
	


	//POST

	@Override
	public String nameInfo(String name) {
		// TODO Auto-generated method stub
		System.out.println("WebServiceImpl-->post --> nameInfo-->name:"
				+ name);
		
		User u=new User();
		u.setId("111");
		u.setName("你好");
		u.setInfo("infoinfoinfo");
		
		if(!("".equals(name)||name==null)){
			u.setName(name);
		}
		
		String user = null;
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		try {
			user=mapper.writeValueAsString(u);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return user;
	}
	
	
	public String allInfo(String info){
		
		System.out.println("WebServiceImpl-->post --> allInfo-->info:"+info);
		
		return "";
	}

	@Override
	public String userInfo(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("WebServiceImpl-->post --> modelInfo-->user:"+user);
		
      ObjectMapper mapper = new ObjectMapper();
		
		String str="";
		try {
			str=mapper.writeValueAsString(user);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		return str;
	}


	
	
	
	
	
	
  
	// end
}
