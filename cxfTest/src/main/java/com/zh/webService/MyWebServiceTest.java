package com.zh.webService;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.ui.Model;

import com.zh.model.User;

@Path(value = "/user")
public interface MyWebServiceTest {
	


/**
 * @GET  http请求方式  doget dpost
 * @Path  根据请求的URL 匹配 类和方法
 * @Produces 定义返回的格式 "text/xml" xml类型, "application/json" json类型
 * 
 */
	
	
	@GET
	@Path("/info")
	@Produces("*/*")
	public String queryParam(@QueryParam("name") String name);
	
	@GET
	@Path("/info/{name}")
	@Produces("*/*")
	public String pathParam(@PathParam("name") String name);

	
	//POST
	
	@POST
	@Path("/info")
	@Produces("*/*")
	public String nameInfo(@FormParam("name") String name);	
	
	@POST
	@Path("/infoall")
	@Produces("*/*")
	public String allInfo(String info);	
	
	
	@POST
	@Path("/userinfo")
	@Consumes("application/json")
	@Produces("*/*")
	public String userInfo(User user);

}
