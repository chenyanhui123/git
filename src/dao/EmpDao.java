package dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import pojo.Emp;

@Repository
public class EmpDao extends HibernateDaoSupport{
	
	@Resource
	public void setsession(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public List<Emp> selectEmp(String hql){
		HibernateTemplate jdbc = getHibernateTemplate();
		List<Emp> emps = (List<Emp>) jdbc.find(hql);
		return emps;
	}
	
	public void addEmp(Emp e){
		HibernateTemplate jdbc = getHibernateTemplate();
		jdbc.save(e);
	}
	
	public void delEmp(Emp e){
		HibernateTemplate jdbc = getHibernateTemplate();
		jdbc.delete(e);
	}
	
	public Emp queryById(Emp e){
		HibernateTemplate jdbc = getHibernateTemplate();
		Emp emp = jdbc.get(Emp.class, e.getId());
		return emp;
	}
	
	public void updateEmp(Emp e){
		HibernateTemplate jdbc = getHibernateTemplate();
		jdbc.update(e);
	}
	
	

}
