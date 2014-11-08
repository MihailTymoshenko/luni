package ua.misha;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener extends ContextLoaderListener {

    public TestServletContextListener() {

    }
}