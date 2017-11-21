package core.web;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import core.service.PatientService;

@Controller
public class MainController extends BaseController {
	@Resource
	private PatientService patientService;
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index.jsp";
	}
	
	@RequestMapping("/showPatient.do")
	public String showPatient(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		return "patient/showPatient.jsp";
	}
	//此处为测试js中Function函数的构造，（即写活js）
	@RequestMapping("/toTest.do")
	public String toTestCase(){
		return "test.jsp";
	}
	
	
}
