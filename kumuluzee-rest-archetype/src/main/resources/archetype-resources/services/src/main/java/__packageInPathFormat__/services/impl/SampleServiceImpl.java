package ${package}.services.impl;

import ${package}.services.SampleService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleServiceImpl implements SampleService {
    
    @Override
    public String returnGreeting() {
        return "Hello world!";
    }

}