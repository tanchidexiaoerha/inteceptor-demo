package com.jingtoo.demo.inteTest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class TestSwagger2 {

    @GetMapping("/menu")
    public Object getMenu() {
        return "123";
    }

    @PostMapping("/add{id}")
    public Object addCar(@PathVariable("id") String id) {
        return id;
    }

    @DeleteMapping("/del{id}")
    public Object delCar(@PathVariable("id") String id) {
        return id;
    }

    @PutMapping("/all")
    public Object getAll(@PathVariable("id") String id) {
        return id;
    }
}
