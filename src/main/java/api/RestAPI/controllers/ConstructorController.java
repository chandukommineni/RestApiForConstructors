package api.RestAPI.controllers;

import api.RestAPI.model.Constructor;
import api.RestAPI.services.ConstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.constructor.Construct;

import java.util.List;

@RestController
@RequestMapping("/constructors")
public class ConstructorController {
    @Autowired
    ConstructorService service;
    @GetMapping("/getData")
    public ResponseEntity<List<Constructor>> getAllData(){
        return service.getAllDetails();
    }
    @GetMapping("getData/name/{name}")
    public ResponseEntity<List<Constructor>>getDataByName(@PathVariable String name){
        return service.getDetailsByName(name);
    }
    @GetMapping("/getDatabyRating")
    public ResponseEntity<List<Constructor>> getDatabyRating(){
        return service.getAllDetailsByRank();
    }
    @GetMapping("/getData/id/{id}")
    public ResponseEntity<Constructor> getDatabyId(@PathVariable("id") int id){

        return service.getDetailsbyId(id);
    }
    @PostMapping("/setData")
    public ResponseEntity<Constructor> setData(@RequestBody Constructor obj){

         return service.setDetails(obj);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Constructor>  updateData(@PathVariable("id") int id,@RequestBody Constructor obj){
        return service.updateDetails(id,obj);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Constructor> deleteDate(@PathVariable("id") int id){

        return service.deleteDetails(id);
    }



}
