package api.RestAPI.services;

import api.RestAPI.model.Constructor;
import api.RestAPI.repositories.constructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructorService {
    @Autowired
    constructorRepository repo;

    public Constructor setDetails(Constructor obj)
    {
        return repo.save(obj);
    }

    public List<Constructor> getAllDetails(){
        return repo.findAll();
    }

    public Optional<Constructor> getDetailsbyId(int id){
        return repo.findById(id);
    }

    public List<Constructor> getDetailsByName(String Name){
        return repo.findByname(Name);
    }
    



}
