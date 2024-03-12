package api.RestAPI.services;

import api.RestAPI.model.Constructor;
import api.RestAPI.repositories.constructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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

}
