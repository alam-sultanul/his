package com.bz.demo.converter.form;

import com.bz.demo.model.gender.Gender;
import org.springframework.core.convert.converter.Converter;

public class GenderConverter implements Converter<String, Gender> {

    @Override
    public Gender convert(String source) {
        try {
            return Gender.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
