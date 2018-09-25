/**   
 * Copyright © 2018 by liuc. All rights reserved.
 *
 * @author: liuc   
 * @date: 2018年9月22日 下午11:28:05 
 * @version: V1.0  
 */  
package com.springcloud.dept.service;

import java.util.List;

import com.springcloud.customer.entities.Dept;

/**@ClassName: DeptService 
 * @Description: 
 * @author: liuc
 * @date: 2018年9月22日 下午11:28:05  
 */
public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
