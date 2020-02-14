package com.gnc.spr.proj.controllers;

import com.gnc.spr.proj.Services.CenterService;
import com.gnc.spr.proj.models.Center;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/centers")

public class CenterController {

    Logger logger = LoggerFactory.getLogger(CenterController.class);

    CenterService centerService;

    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @PostMapping("/create")
    ResponseEntity createCenter(@RequestBody Center center){
        return  ResponseEntity.ok(centerService.create(center));
    }

    @GetMapping("/{id}")
    ResponseEntity<Center> createCenter(@PathVariable int id){
        Optional<Center> center = centerService.findById(id);
        if(!center.isPresent()){
            logger.error("Id " + id + " is not existed");
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(center.get());
    }

}
