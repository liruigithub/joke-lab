package org.jokelab.auth.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {

    private String username;
    private String password;

}
