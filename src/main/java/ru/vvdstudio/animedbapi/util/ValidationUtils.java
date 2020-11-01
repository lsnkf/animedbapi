package ru.vvdstudio.animedbapi.util;

import org.springframework.validation.BindingResult;

import java.util.stream.Collectors;

public class ValidationUtils {

    public static String getFieldErrorsMessage(BindingResult bindingResult) {
        return bindingResult.getFieldErrors()
                .stream()
                .map(it -> String.format("%s - %s", it.getField(), it.getDefaultMessage()))
                .collect(Collectors.joining(","));
    }

}
