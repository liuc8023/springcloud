/**   
 * Copyright © 2018 by liuc. All rights reserved.
 *
 * @author: liuc   
 * @date: 2018年9月24日 下午8:35:07 
 * @version: V1.0  
 */  
package com.springcloud.dept.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**@ClassName: ConfigBean 
 * @Description: 
 * @author: liuc
 * @date: 2018年9月24日 下午8:35:07  
 */

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}

//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">