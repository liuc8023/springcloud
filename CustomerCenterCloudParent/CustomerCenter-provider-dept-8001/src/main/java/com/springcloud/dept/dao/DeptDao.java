/**   
 * Copyright © 2018 by liuc. All rights reserved.
 *
 * @author: liuc   
 * @date: 2018年9月22日 下午11:21:54 
 * @version: V1.0  
 */  
package com.springcloud.dept.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springcloud.customer.entities.Dept;

/**@ClassName: DeptDao 
 * @Description: 
 * @author: liuc
 * @date: 2018年9月22日 下午11:21:54  
 */
@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
