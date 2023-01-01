package ${package}.api;

import org.glassfish.jersey.server.ServerProperties;
import ${package}.api.providers.ObjectMapperProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ApplicationPath("/v1")
public class RestService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(ObjectMapperProvider.class);

        return classes;
    }

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();

        properties.put("jersey.config.server.wadl.disableWadl", "true");
        properties.put(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        // Uncomment for media multipart:
        // properties.put("jersey.config.server.provider.classnames", "org.glassfish.jersey.media.multipart.MultiPartFeature");

        return properties;
    }

}
