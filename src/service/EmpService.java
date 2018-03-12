package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EmpDao;
import pojo.Emp;

@Service
@Transactional
public class EmpService {
	
	@Resource
	private EmpDao ed;
	
	public List<Emp> selectEmp(String ename,Integer did,String xueli){
		String hql="from Emp where 1=1";
		if (ename!=null&&!ename.equals("")) {
			hql=hql+" and ename like '%"+ename+"%'";
		}
		if (did!=null&&did!=0) {
			hql=hql+" and did="+did;
		}
		if (xueli!=null&&!xueli.equals("")) {
			hql=hql+" and xueli like '%"+xueli+"%'";
		}
		List<Emp>emps=ed.selectEmp(hql);
		return emps;
	}
	
	public void addEmp(Emp e){
		ed.addEmp(e);
	}
	
	public void delEmp(Emp e){
		ed.delEmp(e);
	}
	
	public Emp queryById(Emp e){
		return ed.queryById(e);
	}
	
	public void updateEmp(Emp e){
		ed.updateEmp(e);
	}
	
	

}
