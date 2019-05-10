package service;


import entity.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HWRepository;

import java.util.List;

@Service
public class ServiceImpl {

    @Autowired
    private HWRepository repository;

    public List<Component> findAll() {
        return repository.findAll();
    }
}
