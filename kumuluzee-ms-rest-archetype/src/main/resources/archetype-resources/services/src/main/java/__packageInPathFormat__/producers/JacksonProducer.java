package ${package}.producers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.List;
import java.util.Map;

public class JacksonProducer {
    
    private JacksonProducer() {
    
    }
    
    public static ObjectMapper getNewMapper() {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configOverride(List.class).setInclude(JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, null));
        mapper.configOverride(Map.class).setInclude(JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, null));

        mapper.registerModule(new JavaTimeModule());

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        
        return mapper;
    }
    
}
