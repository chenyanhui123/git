package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DeptDao;
import pojo.Dept;

@Service
@Transactional
public class DeptService {
	@Resource
	private DeptDao dd;
	public List<Dept> selectDept(){
		List<Dept>depts = dd.selectDept();
		return depts;
	}

}
