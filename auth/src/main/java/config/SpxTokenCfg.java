package config;

import cn.dev33.satoken.strategy.SaStrategy;
import cn.hutool.core.util.IdUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
public class SpxTokenCfg {
    final
    TokenSnowflake tokenSnowflake;

    public SpxTokenCfg(TokenSnowflake tokenSnowflake) {
        this.tokenSnowflake = tokenSnowflake;
    }

    @Autowired
    public void rewriteSaStrategy() {
        SaStrategy.me.createToken = (loginId, loginType) -> IdUtil.getSnowflake(tokenSnowflake.getWorkerId(), tokenSnowflake.getDatacenterId()).nextIdStr();
    }

    @Data
    @Component
    @ConfigurationProperties(prefix = "token-snowflake")
    private class TokenSnowflake {
        private long workerId;
        private long datacenterId;
    }
}

