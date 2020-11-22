package com.ccw.services;

public interface IRedisService {

    void putToRedis(String key, String value);

    String getByKey(String key);
}
