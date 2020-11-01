package ru.vvdstudio.animedbapi.util;

import org.springframework.lang.NonNull;

public class ExceptionUtils {

    public static Throwable getRootCause(@NonNull Throwable throwable) {
        Throwable rootCause = throwable;
        while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
            rootCause = rootCause.getCause();
        }
        return rootCause;
    }

}
