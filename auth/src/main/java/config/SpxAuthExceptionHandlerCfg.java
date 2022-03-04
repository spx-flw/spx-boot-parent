package config;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.NotRoleException;
import cn.spx.constant.AuthenticationConst;
import cn.spx.entity.ServeResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class SpxAuthExceptionHandlerCfg {
    @ExceptionHandler(NotLoginException.class)
    public ServeResponse handlerNotLoginException(NotLoginException nle) {
        if (nle.getType().equals(NotLoginException.NOT_TOKEN)) return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_NOT_TOKEN)
                .return_desc("not token")
                .build();
        else if (nle.getType().equals(NotLoginException.INVALID_TOKEN)) return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_INVALID_TOKEN)
                .return_desc("token invalid")
                .build();
        else if (nle.getType().equals(NotLoginException.TOKEN_TIMEOUT)) return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_TOKEN_TIMEOUT)
                .return_desc("token timeout")
                .build();
        else if (nle.getType().equals(NotLoginException.BE_REPLACED)) return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_BE_REPLACED)
                .return_desc("token disconnect")
                .build();
        else return ServeResponse.builder()
                    .return_code(AuthenticationConst.SPX_KICK_OUT)
                    .return_desc("not login")
                    .build();
    }


    @ExceptionHandler(NotRoleException.class)
    public ServeResponse handlerNotRoleException(NotRoleException nre) {
        return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_AUTH_NOT_ROLE)
                .return_desc(nre.getMessage())
                .build();
    }


    @ExceptionHandler(NotPermissionException.class)
    public ServeResponse handlerNotPermissionException(NotPermissionException npe) {
        return ServeResponse
                .builder()
                .return_code(AuthenticationConst.SPX_AUTH_NOT_PERM)
                .return_desc(npe.getMessage())
                .build();
    }
}
