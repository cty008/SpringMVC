package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Users")  //模块化写法
public class UsersController {
	
	@RequestMapping("/add")  //页面返回路径的名字
	public String add() {
		System.out.println("添加");
		return "add"; 	//JSP页面路径
	}
	
	@RequestMapping(value="/index3",method=RequestMethod.POST,params="username")  //页面返回路径的名字
	public String index3(@RequestParam(value="username",required=false)String username,Map<String, Object> model) {
		System.out.println("username:"+username);
		model.put("username", username);
		return "userCode";
	}
}
