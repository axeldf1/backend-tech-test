package com.littlebill.webapp.security.registration;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<Void> Register(@ModelAttribute RegistrationRequest request, HttpServletResponse response){
        System.out.println(registrationService.register(request));
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("http://localhost:9000")).build();
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
