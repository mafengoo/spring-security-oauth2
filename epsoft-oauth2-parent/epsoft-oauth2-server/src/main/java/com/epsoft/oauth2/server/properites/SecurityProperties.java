package com.epsoft.oauth2.server.properites;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: mafeng
 */
@Component // 不要少了
@ConfigurationProperties(prefix = "mengxuegu.security")
public class SecurityProperties {

    // 会将 mengxuegu.security.authentication 下面的值绑定到AuthenticationProperties对象上
    private AuthenticationProperties authentication;

    public AuthenticationProperties getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationProperties authentication) {
        this.authentication = authentication;
    }
}
