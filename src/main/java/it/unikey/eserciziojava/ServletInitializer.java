package it.unikey.eserciziojava;

import it.unikey.eserciziojava.DAL.entity.EsercizioJavaApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EsercizioJavaApplication.class);
    }

}
