package org.jokelab.talk.web.rest;

import org.jokelab.talk.web.dto.PutRedisRequest;
import org.jokelab.talk.web.dto.Response;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource(name="redisTemplate")
    private ValueOperations<String, String> valueOperations;

    @PostMapping("/redis")
    public Response helloRedis(@RequestBody PutRedisRequest redisRequest){
        valueOperations.set(redisRequest.getKey(), redisRequest.getValue());
        return Response.success();
    }

    @GetMapping("/redis")
    public Response helloRedis2(String key){
        return Response.success(valueOperations.get(key));
    }

}
