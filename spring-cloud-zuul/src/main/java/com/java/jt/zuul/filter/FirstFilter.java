package com.java.jt.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by jt on 2019/10/28 16:20
 */
@Component
public class FirstFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext rct = RequestContext.getCurrentContext();
        HttpServletRequest request = rct.getRequest();
        //todo

        String id = request.getSession().getId();
        rct.setSendZuulResponse(false);
        rct.setResponseStatusCode(110);
        try {
            rct.getResponse().getWriter().write("1111111111");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
