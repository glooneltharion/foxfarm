package com.gfa.springplussql.service;

import com.gfa.springplussql.model.Fox;
import com.gfa.springplussql.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoxServiceImpl implements FoxService {

    private final FoxRepository foxRepository;

    @Autowired
    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    @Override
    public List<Fox> listAllFoxes() {
        return foxRepository.findAll();
    }

    @Override
    public void createFox(Fox fox) {
        foxRepository.save(fox);
    }

    @Override
    public void deleteFoxById(Long id) {
        Optional<Fox> fox = foxRepository.findById(id);
        if (fox.isPresent()) {
            foxRepository.delete(fox.get());
        }
    }

    @Override
    public void updateFoxById(Long id) {
        Optional<Fox> fox = foxRepository.findById(id);
        if (fox.isPresent()) {
            Fox f = fox.get();
            f.setAge(f.getAge() + 1);
            foxRepository.save(f);
        }
    }

    @Override
    public List<Fox> findByString(String s) {
        return foxRepository.findFoxByNameContainsIgnoreCase(s);
    }

    @Override
    public List<Fox> findRedFoxesJPQL() {
        return foxRepository.findAllRedFoxes();
    }

    @Override
    public List<Fox> findRedFoxesNative() {
        return foxRepository.findAllRedFoxesNative();
    }
}
