package ua.misha;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener extends ContextLoaderListener {

    public TestServletContextListener() {
        super(new AnnotationConfigWebApplicationContext());

    }
}