package org.jokelab.core.http.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * http响应对象
 */
@Getter
@Setter
public class Response {

    private Response(){}

    /**
     * 状态
     */
    private Boolean success;
    /**
     * 服务端返回消息
     */
    private List<Message> messages;
    /**
     * 返回数据
     */
    private Object data;

    public static Response success(Object data){
        return of(Boolean.TRUE, data);
    }

    public static Response failure(Message ...msg){
        return of(Boolean.FALSE, null, msg);
    }

    public static Response of(Boolean success, Object data){
        return of(success, data, null);
    }
    public static Response of(Boolean success, Object data, Message ...msgs){
        Response response = new Response();
        if (success != null) {
            response.setSuccess(success);
        } else {
            response.setSuccess(Boolean.FALSE);
        }
        response.setData(data);
        if (msgs != null && msgs.length > 0) {
            response.setMessages(Arrays.asList(msgs));
        } else {
            response.setMessages(Collections.emptyList());
        }
        return response;
    }


    @Getter
    @Setter
    public class Message {
        private String msg;
        private String code;
    }

}
