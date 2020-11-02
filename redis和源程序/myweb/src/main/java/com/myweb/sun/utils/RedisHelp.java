package com.myweb.sun.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RedisHelp {
    @Autowired
    private RedisClient redisClient;

    public String create(Integer id) {
        String token = UUID.randomUUID().toString().replace("-", "");
        redisClient.set(id == null ? null : String.valueOf(id), token, RedisClient.TOKEN_EXPIRES_SECOND);
        return token;
    }

    public boolean check(Integer id,String token) {
        boolean result = false;
        if(!StringUtils.isBlank(token)) {
            String userId = id.toString();
            String authenticatedToken = redisClient.get(userId);
            if(authenticatedToken != null && authenticatedToken.equals(token)) {
                redisClient.expire(userId, RedisClient.TOKEN_EXPIRES_SECOND);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(Integer id) {
        return redisClient.remove(id == null ? null : String.valueOf(id));
    }

    public String get(Integer id) {
        return redisClient.get(id.toString());
    }
}
