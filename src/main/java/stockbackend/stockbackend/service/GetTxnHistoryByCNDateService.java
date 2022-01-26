package stockbackend.stockbackend.service;

import stockbackend.stockbackend.entity.TransactionHistory;


import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface GetTxnHistoryByCNDateService {
    public List<TransactionHistory> findByCNAndDate(String CompanyName, String fromDate,String toDate) throws ParseException;

    public List<TransactionHistory> findByCN(String name) throws ParseException;

    public List<TransactionHistory> findByDate(String fromDate, String toDate) throws ParseException;

}
