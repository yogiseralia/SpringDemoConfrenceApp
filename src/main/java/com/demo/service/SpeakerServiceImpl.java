package com.demo.service;

import com.demo.model.Speaker;
import com.demo.repository.HibernateSpeakerRepositoryImpl;
import com.demo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
