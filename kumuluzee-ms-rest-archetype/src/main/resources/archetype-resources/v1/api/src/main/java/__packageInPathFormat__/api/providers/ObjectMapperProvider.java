package ${package}.api.providers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ${package}.producers.JacksonProducer;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {
    
    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        return JacksonProducer.getNewMapper();
    }
}
