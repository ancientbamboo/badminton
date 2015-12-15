package com.dqty.yuxiaoer.common.filters;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class CharacterEncodingFilter
 */
@WebFilter(description = "字符集过滤器", urlPatterns = { "/*" }, initParams = {@WebInitParam(name = "encoding", value = "UTF-8", description = "设置字符集为UTF-8")})
public class CharacterEncodingFilter extends org.springframework.web.filter.CharacterEncodingFilter{
       
    /**
     * @see org.springframework.web.filter.CharacterEncodingFilter#org.springframework.web.filter.CharacterEncodingFilter()
     */
    public CharacterEncodingFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

}
