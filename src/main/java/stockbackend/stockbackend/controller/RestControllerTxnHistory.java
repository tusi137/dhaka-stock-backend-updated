package stockbackend.stockbackend.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stockbackend.stockbackend.entity.TransactionHistory;
import stockbackend.stockbackend.service.GetNewsDetailsService;
import stockbackend.stockbackend.service.GetTxnHistoryByCNDateService;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
public class RestControllerTxnHistory {

    @Autowired
    private GetTxnHistoryByCNDateService getTxnHistoryByCNDateService;


    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/by/txn/history",consumes = "application/json",produces = "application/json")
    public List<TransactionHistory> getDataByCompanyNameAndDate(@RequestParam(value = "CompanyName",required = true)String CompanyName,
                                                                @RequestParam(value = "fromDate",required = false)@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") String fromDate,
                                                     @RequestParam(value = "toDate",required = false)@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") String toDate) throws ParseException {
        try {
            if (CompanyName == null) {
                System.out.println("Company Name can't be null");
            } else if (fromDate == null) {
                System.out.println("No from date choosen");
            } else if (toDate == null) {
                System.out.println("No to date choosen");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        return getTxnHistoryByCNDateService.findByCNAndDate(CompanyName, fromDate, toDate);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/by/txn/history/company/name",consumes = "application/json",produces = "application/json")
    public List<TransactionHistory> getDataByCompanyName(@RequestParam(value = "name",required = true)String name) throws ParseException {
        return getTxnHistoryByCNDateService.findByCN(name);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/by/txn/history/by/date",consumes = "application/json",produces = "application/json")
    public List<TransactionHistory> getDataByCompanyDate(@RequestParam(value = "fromDate",required = false)@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") String fromDate,
                                                         @RequestParam(value = "toDate",required = false)@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") String toDate) throws ParseException {
        System.out.println(fromDate);
        System.out.println(toDate);
        return getTxnHistoryByCNDateService.findByDate(fromDate,toDate);
    }


}
