package com.bz.demo.converter.form;

import com.bz.demo.model.common.QuestionType;
import com.bz.demo.model.common.UserType;
import org.springframework.core.convert.converter.Converter;

public class QuestionTypeConverter implements Converter<String, QuestionType> {
    @Override public QuestionType convert(String source) {
        try {
            return QuestionType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
