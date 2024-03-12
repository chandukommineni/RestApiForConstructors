package api.RestAPI.controllers;

import api.RestAPI.model.Constructor;
import api.RestAPI.services.ConstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConstructorController {
    @Autowired
    ConstructorService service;

    @PostMapping("/setData")
    public Constructor setData(@RequestBody Constructor obj){

        Constructor constructor = service.setDetails(obj);
        return constructor;

    }

    @GetMapping("/getData")
    public List<Constructor> getAllData(){
        List<Constructor> allDetails = service.getAllDetails();
        return allDetails;
    }

}
