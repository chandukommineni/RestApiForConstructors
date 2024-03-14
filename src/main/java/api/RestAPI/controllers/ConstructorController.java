package api.RestAPI.controllers;

import api.RestAPI.model.Constructor;
import api.RestAPI.services.ConstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constructors")
public class ConstructorController {
    @Autowired
    ConstructorService service;

    @PostMapping("/setData")
    public Constructor setData(@RequestBody Constructor obj){

        Constructor constructor = service.setDetails(obj);
        return constructor;

    }

    @PutMapping("/update/{id}")
    public Constructor updateData(@RequestBody Constructor obj,@PathVariable("id") Integer id){
        return service.updateDetails(obj,id);
    }

    @GetMapping("/getData")
    public List<Constructor> getAllData(){
        List<Constructor> allDetails = service.getAllDetails();
        return allDetails;
    }
    @GetMapping("/getData/{name}")
    public List<Constructor> getDataByName(@PathVariable String name){
        return service.getDetailsByName(name);
    }
    @GetMapping("/getDatabyRating")
    public List<Constructor> getDatabyRating(){
        return service.getAllDetailsByRank();
    }

}
