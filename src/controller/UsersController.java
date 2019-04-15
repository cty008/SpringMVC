package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Users")  //ģ�黯д��
public class UsersController {
	
	@RequestMapping("/add")  //ҳ�淵��·��������
	public String add() {
		System.out.println("���");
		return "add"; 	//JSPҳ��·��
	}
	
	@RequestMapping(value="/index3",method=RequestMethod.POST,params="username")  //ҳ�淵��·��������
	public String index3(@RequestParam(value="username",required=false)String username,Map<String, Object> model) {
		System.out.println("username:"+username);
		model.put("username", username);
		return "userCode";
	}
}
