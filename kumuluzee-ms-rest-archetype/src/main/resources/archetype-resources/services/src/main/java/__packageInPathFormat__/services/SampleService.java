package ${package}.services;

import java.util.List;

import com.kumuluz.ee.rest.beans.QueryParameters;
import ${package}.lib.Sample;

public interface SampleService {
    
    List<Sample> getSamples(QueryParameters query);
    
    long getSamplesCount(QueryParameters query);
    
    List<Sample> findByAge(int age);
    
}