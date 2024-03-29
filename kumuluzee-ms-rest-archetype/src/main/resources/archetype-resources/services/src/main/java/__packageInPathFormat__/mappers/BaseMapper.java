package ${package}.mappers;

import ${package}.lib.BaseType;
import ${package}.persistence.BaseEntity;

public class BaseMapper {
    
    private BaseMapper() {
    
    }
    
    public static <T extends BaseType, E extends BaseEntity> T fromEntity(E entity, Class<T> typeClass) {
        try {
            T instance = typeClass.getDeclaredConstructor().newInstance();
            return fromEntity(entity, instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static <T extends BaseType, E extends BaseEntity> T fromEntity(E entity, T type) {
        type.setId(entity.getId());
        if (entity.getCreatedAt() != null) {
            type.setCreatedAt(entity.getCreatedAt().toInstant());
        }
        if (entity.getUpdatedAt() != null) {
            type.setUpdatedAt(entity.getUpdatedAt().toInstant());
        }
        return type;
    }
    
}