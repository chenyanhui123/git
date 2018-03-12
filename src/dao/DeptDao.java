package dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import pojo.Dept;

@Repository
public class DeptDao extends HibernateDaoSupport{
	
	@Resource
	public void setsessio(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public List<Dept> selectDept(){
		HibernateTemplate jdbc = getHibernateTemplate();
		String  hql = "from Dept";
		List<Dept> depts = (List<Dept>) jdbc.find(hql);
		return depts;
		
	}

}
