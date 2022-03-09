package api;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.map.MapBuilder;
import cn.spx.entity.ServeResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mlmdflr
 * @date 2022-03-05 8:52
 */
@RestController
public class HelloWorldApi {

    @GetMapping()
    public ServeResponse<Integer, Map<String, Object>, String> login() {
        StpUtil.login(1);
        return new ServeResponse.Builder<Integer, Map<String, Object>, String>()
                .return_code(201)
                .return_data(MapBuilder.create(new HashMap<String, Object>())
                        .put("info", StpUtil.getTokenInfo())
                        .put("req", "login")
                        .put("msg", "Login Success")
                        .build())
                .return_desc("Request Success")
                .success()
                .build();
    }


    @PostMapping()
    @SaCheckLogin
    public ServeResponse<Integer, Map<String, Object>, String> testLogin() {
        return new ServeResponse.Builder<Integer, Map<String, Object>, String>()
                .return_code(200)
                .return_data(MapBuilder.create(new HashMap<String, Object>())
                        .put("info", StpUtil.getTokenInfo())
                        .put("req", "testLogin")
                        .put("msg", "Test Login Success")
                        .build())
                .return_desc("Request success")
                .success()
                .build();
    }

}
