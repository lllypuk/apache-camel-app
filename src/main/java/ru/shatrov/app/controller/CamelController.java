package ru.shatrov.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shatrov.app.service.CamelService;

/**
 * Created on 18.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@RestController
public class CamelController {

    protected final CamelService camelService;

    @Autowired
    public CamelController(CamelService camelService) {
        this.camelService = camelService;
    }

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok(camelService.action());
    }
}
