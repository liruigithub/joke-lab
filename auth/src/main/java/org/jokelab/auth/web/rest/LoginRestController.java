package org.jokelab.auth.web.rest;

import org.jokelab.auth.web.dto.request.LoginRequestDTO;
import org.jokelab.core.http.model.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {

    @PostMapping("/login")
    public Response login(@RequestBody LoginRequestDTO loginRequestDTO){
        return Response.success(loginRequestDTO);
    }
}
