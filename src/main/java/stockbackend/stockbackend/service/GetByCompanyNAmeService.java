package stockbackend.stockbackend.service;

import stockbackend.stockbackend.entity.CompanyPofile;

import java.util.List;

public interface GetByCompanyNAmeService {
    public List<CompanyPofile> findBy_companyName(String CompanyName);
}
