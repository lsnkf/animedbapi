package ru.vvdstudio.animedbapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vvdstudio.animedbapi.to.ErrorMessage;
import ru.vvdstudio.animedbapi.util.ExceptionUtils;
import ru.vvdstudio.animedbapi.util.ValidationUtils;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage notFoundExceptionHandle(HttpServletRequest httpServletRequest, Throwable throwable) {
        return getErrorMessage(HttpStatus.NOT_FOUND.value(),
                httpServletRequest,
                ExceptionUtils.getRootCause(throwable).getMessage());
    }

    @ExceptionHandler(value = {BindException.class, MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErrorMessage validationExceptionHandle(HttpServletRequest httpServletRequest, Throwable throwable) {
        BindingResult bindingResult = throwable instanceof BindException ?
                ((BindException) throwable).getBindingResult() :
                ((MethodArgumentNotValidException) throwable).getBindingResult();
        return getErrorMessage(HttpStatus.UNPROCESSABLE_ENTITY.value(),
                httpServletRequest,
                ValidationUtils.getFieldErrorsMessage(bindingResult));
    }

    @ExceptionHandler(value = {Throwable.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage defaultExceptionHandle(HttpServletRequest httpServletRequest, Throwable throwable) {
        return getErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                httpServletRequest,
                ExceptionUtils.getRootCause(throwable).getMessage());
    }

    private ErrorMessage getErrorMessage(int code, HttpServletRequest httpServletRequest, String message) {
        return new ErrorMessage(code,
                httpServletRequest.getRequestURI(),
                message);
    }

}
