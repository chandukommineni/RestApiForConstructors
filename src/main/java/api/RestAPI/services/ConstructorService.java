package api.RestAPI.services;

import api.RestAPI.model.Constructor;
import api.RestAPI.repositories.constructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructorService {
    @Autowired
    constructorRepository repo;

    public ResponseEntity<List<Constructor>> getAllDetails(){
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<Constructor>> getAllDetailsByRank(){
        return new ResponseEntity<>(repo.findTopByratingDesc(),HttpStatus.OK);

    }
    public ResponseEntity<Constructor> getDetailsbyId(int id){
        Constructor con= repo.findById(id).orElse(null);
        if (con!=null){
            return new ResponseEntity<>(con,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<List<Constructor>> getDetailsByName(String name){
        return new ResponseEntity<>(repo.findByname(name),HttpStatus.OK);
    }


    public ResponseEntity<Constructor> setDetails(Constructor obj)
    {
        return new ResponseEntity<>(repo.save(obj),HttpStatus.CREATED);
    }

    public  ResponseEntity<Constructor> updateDetails(int id,Constructor obj){
        Constructor con=repo.findById(id).orElse((null));
        if (con!=null){
            obj.setId(id);
            return new ResponseEntity<>(repo.save(obj),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Constructor> deleteDetails(int id){
        Constructor con=repo.findById(id).orElse((null));
        if (con!=null){
            repo.delete(con);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }




}
