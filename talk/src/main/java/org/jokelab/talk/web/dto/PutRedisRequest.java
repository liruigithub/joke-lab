package org.jokelab.talk.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PutRedisRequest {

    private String key;
    private String value;
}
