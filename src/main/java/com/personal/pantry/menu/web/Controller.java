package com.personal.pantry.menu.web;

import com.personal.pantry.menu.model.menu.Menu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /**
     * Create access to the repository within the controller
     *
     * TODO: Implement the registry class in a separate package
     * */
    private MenuRegistry reggie;

    @GetMapping("/")
    public ResponseEntity<String> index() {
        //TODO: implement this
        return ResponseEntity.ok("Welcome to Pantry Menu Application");
    }

    @GetMapping("/menu")
    public ResponseEntity<Menu> getMenu() {
        //  TODO: implement this
        return null;
    }

}
