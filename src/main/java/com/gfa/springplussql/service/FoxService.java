package com.gfa.springplussql.service;

import com.gfa.springplussql.model.Fox;

import java.util.List;

public interface FoxService {
    List<Fox> listAllFoxes();

    void createFox(Fox fox);

    void deleteFoxById(Long id);

    void updateFoxById(Long id);

    List<Fox> findByString(String s);

    List<Fox> findRedFoxesJPQL();

    List<Fox> findRedFoxesNative();
}
