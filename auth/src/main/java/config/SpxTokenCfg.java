package config;

import cn.dev33.satoken.strategy.SaStrategy;
import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SpxTokenCfg {
    @Autowired
    public void rewriteSaStrategy() {
        SaStrategy.me.createToken = (loginId, loginType) -> IdUtil.getSnowflake(1,1).nextIdStr();
    }
}
