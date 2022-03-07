import cn.hutool.core.map.MapBuilder;
import cn.spx.entity.ServeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mlmdflr
 * @date 2022-03-05 8:52
 */
@RestController
public class HelloWorldApi {

    @GetMapping("get")
    public ServeResponse<Integer, Map<String, Object>, String> get() {
        return new ServeResponse.Builder<Integer, Map<String, Object>, String>()
                .return_code(200)
                .return_data(MapBuilder.create(new HashMap<String, Object>())
                        .put("req", "get")
                        .put("msg", "Hello World!")
                        .build())
                .return_desc("Request success")
                .success()
                .build();
    }
}
