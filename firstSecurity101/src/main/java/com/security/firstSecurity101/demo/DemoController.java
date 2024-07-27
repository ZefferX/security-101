package com.security.firstSecurity101.demo;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/demo-controller")
public class DemoController {


    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
