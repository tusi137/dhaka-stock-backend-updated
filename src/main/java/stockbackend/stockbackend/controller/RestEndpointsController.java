package stockbackend.stockbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stockbackend.stockbackend.entity.CompanyPofile;
import stockbackend.stockbackend.entity.TransactionHistory;
import stockbackend.stockbackend.service.GetByCompanyNAmeService;
import stockbackend.stockbackend.service.GetTxnHistoryByCNDateService;
import stockbackend.stockbackend.service.ReadAllnfoCPService;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class RestEndpointsController {

    @Autowired
    private ReadAllnfoCPService readAllnfoCPService;
    private Object List;
    @Autowired
    private GetByCompanyNAmeService getByCompanyNAmeService;


    //@GetMapping("/api/v1")
    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/all/company/profile/data")
    public List<CompanyPofile> getAllData(){
        return readAllnfoCPService.getAllData();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/by/company/name",consumes = "application/json",produces = "application/json")
    public List<CompanyPofile>getDataByCompanyName(@RequestParam(value = "CompanyName",required = true)String CompanyName){
        return getByCompanyNAmeService.findBy_companyName(CompanyName);
    }

}
