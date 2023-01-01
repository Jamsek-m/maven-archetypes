package ${package}.api.providers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ${package}.producers.JacksonProducer;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {

    private static ObjectMapper mapper;

    public static ObjectMapper getProvidedMapper() {
        if (mapper == null) {
            return JacksonProducer.getNewMapper();
        }
        return mapper;
    }

    public ObjectMapperProvider() {
        if (mapper == null) {
            mapper = JacksonProducer.getNewMapper();
        }
    }

    @Override
    public ObjectMapper getContext(Class<?> aClass) {
        return mapper;
    }

}
