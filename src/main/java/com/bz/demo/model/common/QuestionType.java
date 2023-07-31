package com.bz.demo.model.common;

import com.bz.demo.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum QuestionType {
    MULTIPLE_CHOICE(1,"Multiple choice"),
    TRUE_FALSE(1,"True : False");

    private int id;
    private String name;

    public static QuestionType getById(int id) {
        return Arrays.stream(values())
                .filter(type -> type.id == id)
                .findAny()
                .orElseThrow(NotFoundException::new);
    }
}
