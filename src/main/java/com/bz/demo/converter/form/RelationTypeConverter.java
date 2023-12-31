package com.bz.demo.converter.form;

import com.bz.demo.model.relationType.RelationType;
import org.springframework.core.convert.converter.Converter;

public class RelationTypeConverter implements Converter<String, RelationType> {
    @Override
    public RelationType convert(String source) {
        try {
            return RelationType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
