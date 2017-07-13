package com.lcc.myproject.config;

import com.lcc.myproject.jerseyservice.HelloEndpoint;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * Created by liangchengcheng on 2017/7/11.
 */
@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig{

    @Value("${spring.jersey.application-path:/api}")
    private String apiPath;

    public JerseyConfig() {
        this.registerEndpoints();
    }

    @PostConstruct
    public void init() {
        this.configureSwagger();
    }

    private void registerEndpoints() {
        this.register(HelloEndpoint.class);
    }

    private void configureSwagger(){
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        BeanConfig config = new BeanConfig();
        config.setTitle("基于Spring Boot,Jersey, Swagger的Restful API");
        config.setVersion("1.0.0");
        config.setContact("赵配");
        config.setSchemes(new String[] { "http", "https" });
        config.setBasePath(this.apiPath);
        config.setResourcePackage("online.zhaopei.myproject.jerseyservice");
        config.setPrettyPrint(true);
        config.setScan(true);
    }

}
