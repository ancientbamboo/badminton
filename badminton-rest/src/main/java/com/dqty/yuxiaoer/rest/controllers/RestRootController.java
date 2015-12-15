/**
 * 
 */
package com.dqty.yuxiaoer.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dqty.yuxiaoer.core.domains.User;
import com.dqty.yuxiaoer.rest.domains.RestResult;

/**
 * @author 王照瑞
 *
 */
@RestController
@RequestMapping(value = "/")
public class RestRootController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public RestResult<User> getCustomer(@RequestParam("uid") String uid, @RequestParam("pwd") String pwd) {//http://localhost:8080/XesCommon/rest/rest/demo/1111111
		RestResult<User> result = new RestResult<User>();
		System.out.println("...................................");
		return result;
	}
}
