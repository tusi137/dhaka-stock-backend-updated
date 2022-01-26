package stockbackend.stockbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbackend.stockbackend.entity.CompanyPofile;
import stockbackend.stockbackend.repositories.ReadCPRepository;
import stockbackend.stockbackend.service.GetByCompanyNAmeService;

import java.util.List;


@Service
public class GetByCompanyNameImpl implements GetByCompanyNAmeService {
    @Autowired
    private ReadCPRepository readCPRepository;
    @Override
    public List<CompanyPofile> findBy_companyName(String CompanyName) {
        return readCPRepository.findBy_companyName(CompanyName);
    }
}
