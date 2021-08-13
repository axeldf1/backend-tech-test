package com.littlebill.webapp.service;

import com.littlebill.webapp.repository.CatFactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CatFactService {

    @Autowired
    private CatFactRepository _catFactRepository;

    public String GetCatFact() {
        return _catFactRepository.GetRandomFact().getFact();
    }
}
