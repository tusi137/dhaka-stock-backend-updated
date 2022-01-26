package stockbackend.stockbackend.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbackend.stockbackend.entity.CompanyPofile;
import stockbackend.stockbackend.repositories.ReadCPRepository;
import stockbackend.stockbackend.service.ReadAllnfoCPService;

import java.util.List;

@Service
public class ReadAllnfoCPServiceImpl implements ReadAllnfoCPService {

    @Autowired
    private ReadCPRepository readCPRepository;

    @Override
    public List<CompanyPofile> getAllData() {
        return readCPRepository.getAllData();
    }


}
