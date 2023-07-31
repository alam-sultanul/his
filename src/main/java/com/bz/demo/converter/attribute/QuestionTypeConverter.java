package com.bz.demo.converter.attribute;

import com.bz.demo.model.common.QuestionType;
import com.bz.demo.model.common.UserType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class QuestionTypeConverter implements AttributeConverter<QuestionType, Integer> {
    @Override public Integer convertToDatabaseColumn(QuestionType type) {
        return type.getId();
    }

    @Override public QuestionType convertToEntityAttribute(Integer id) {
        return QuestionType.getById(id);
    }
}
