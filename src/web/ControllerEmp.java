package web;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Dept;
import pojo.Emp;
import service.DeptService;
import service.EmpService;

@Controller
public class ControllerEmp {
	
	@Resource 
	private EmpService es;
	@Resource
	private DeptService ds;
	@RequestMapping("/showEmp")
	public String  fn1(ModelMap map,String ename,Integer did,String xueli){
		List<Emp> list = es.selectEmp(ename, did, xueli);
		List<Dept> depts = ds.selectDept();
		map.put("depts", depts);
		map.put("list", list);
		return "emp";		
	}
	

	@RequestMapping("/addEmp")
	public String  fn3(ModelMap map){
		List<Dept> depts = ds.selectDept();
		map.put("depts", depts);
		return "add";		
	}
	
	@RequestMapping("/addEmp2")
	public String  fn2(Emp emp){
		emp.setBrith(new Date());
		es.addEmp(emp);
		return "redirect:showEmp";		
	}
	
	@RequestMapping("/delEmp")
	public String fn4(Emp e){
		es.delEmp(e);
		return "redirect:showEmp";		
	}
	
	@RequestMapping("/updateEmp")
	public String  fn5(Emp e,ModelMap map){
		Emp emp = es.queryById(e);
		map.put("emp", emp);
		map.put("depts", ds.selectDept());
		return "update";		
	}
	
	@RequestMapping("/updateEmp2")
	public String fn6(Emp e){
		es.updateEmp(e);
		return "redirect:showEmp";		
	}
	
	

}
