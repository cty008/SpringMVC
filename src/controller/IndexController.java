package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/Index")	//ģ�黯д��
public class IndexController /*extends AbstractController*/ {

	@RequestMapping("/list")  //ҳ�淵��·��������
	public String list() {
		System.out.println("list");
		return "list";
	}
	
	@RequestMapping("/add")  //ҳ�淵��·��������
	public String add() {
		System.out.println("add");
		return "add";
	}
	@RequestMapping("/update")  //ҳ�淵��·��������
	public String update() {
		System.out.println("update");
		return "update";
	}
	
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("hello,SpringMVC");
//		return new ModelAndView("index");		//����ҳ��
//	}

}
