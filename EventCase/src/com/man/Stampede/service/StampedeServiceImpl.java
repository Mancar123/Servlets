package com.man.Stampede.service;

import com.man.Stampede.dto.StampedeDto;
import com.man.Stampede.repository.StampedeRepository;
import com.man.Stampede.repository.StampedeRepositoryImpl;

public class StampedeServiceImpl implements StampedeService{
    @Override
    public boolean save(StampedeDto stampedeDto)

    {
        StampedeRepository stampedeRepository=new StampedeRepositoryImpl();
        boolean a =stampedeRepository.persist(stampedeDto);

        if (stampedeDto!=null) {
            System.out.println("running in service");
        }else{
            System.out.println("failed to load");
        }

        return a;
    }
}
