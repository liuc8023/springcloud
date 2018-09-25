/**   
 * Copyright © 2018 by liuc. All rights reserved.
 *
 * @author: liuc   
 * @date: 2018年9月22日 下午11:29:23 
 * @version: V1.0  
 */  
package com.springcloud.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.customer.entities.Dept;
import com.springcloud.dept.dao.DeptDao;
import com.springcloud.dept.service.DeptService;

/**@ClassName: DeptServiceImpl 
 * @Description: 
 * @author: liuc
 * @date: 2018年9月22日 下午11:29:23  
 */
@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
