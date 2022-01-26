package stockbackend.stockbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbackend.stockbackend.entity.TransactionHistory;
import stockbackend.stockbackend.repositories.ReadTxnHistory;
import stockbackend.stockbackend.service.GetTxnHistoryByCNDateService;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class GetTxnHistoryByCNDateImpl implements GetTxnHistoryByCNDateService {

    @Autowired
    private ReadTxnHistory readTxnHistory;

    @Override
    public List<TransactionHistory> findByCNAndDate(String CompanyName, String fromDate, String toDate) throws ParseException {
        String s=null,o=null;
        try {
            if (fromDate == null || toDate != null) {
                DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime strDate = LocalDateTime.parse(fromDate, inputFormat);
                DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                s = strDate.format(outputFormat);
                System.out.println(s);


                LocalDateTime endDate = LocalDateTime.parse(toDate, inputFormat);
                o = endDate.format(outputFormat);
                System.out.println(o);

                System.out.println("to date : " + toDate);
                System.out.println("from date : " + s);


            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return readTxnHistory.findByCNAndDate(CompanyName, s, o);
    }
    @Override
    public List<TransactionHistory> findByCN(String name) throws ParseException {
        return readTxnHistory.findByCN(name);
    }

    @Override
    public List<TransactionHistory> findByDate(String fromDate, String toDate) throws ParseException {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime strDate = LocalDateTime.parse(fromDate, inputFormat);
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s=strDate.format(outputFormat);
        System.out.println(s);


        LocalDateTime endDate = LocalDateTime.parse(toDate, inputFormat);
        String o=endDate.format(outputFormat);
        System.out.println(o);

        System.out.println("to date : " + toDate);
        System.out.println("from date : " + s);
        return readTxnHistory.findByDate(s,o);
    }
}
