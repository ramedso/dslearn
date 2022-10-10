package com.atlas.dslearn.resources.exceptions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationError extends StandardError{

    private List<FieldMessage> errors = new ArrayList<>();

    public void addError(String fieldMessage, String message) {
        errors.add(new FieldMessage(fieldMessage, message));
    }
}
