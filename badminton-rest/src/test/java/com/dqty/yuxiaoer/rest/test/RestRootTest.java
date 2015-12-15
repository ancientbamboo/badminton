/**
 * 
 */
package com.dqty.yuxiaoer.rest.test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.dqty.yuxiaoer.common.utils.RestMethodUtil;

/**
 * @author 王照瑞
 *
 */
public class RestRootTest {
	@Test
	public void login() throws Exception {
		Map<String, String> parameter = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		
		parameter.put("uid", "123456");
		parameter.put("pwd", "7890");
		
		URL url = new URL("http://10.3.1.33:8080/badminton-rest/rest/login.json");
		String result = RestMethodUtil.invok(url, RestMethodUtil.HttpMethods.POST, parameter, header);
		System.out.println(result);
	}
}
