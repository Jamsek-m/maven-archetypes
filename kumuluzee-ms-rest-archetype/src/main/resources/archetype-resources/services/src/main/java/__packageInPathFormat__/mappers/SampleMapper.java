package ${package}.mappers;

import ${package}.lib.Sample;
import ${package}.persistence.SampleEntity;

public class SampleMapper {
    
    public static Sample fromEntity(SampleEntity entity) {
        return new Sample();
    }
    
}