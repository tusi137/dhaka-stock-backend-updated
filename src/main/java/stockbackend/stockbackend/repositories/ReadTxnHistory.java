package stockbackend.stockbackend.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import stockbackend.stockbackend.entity.CompanyPofile;
import stockbackend.stockbackend.entity.TransactionHistory;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
@Qualifier(value = "ReadTxnHistory")
public interface ReadTxnHistory extends JpaRepository<TransactionHistory,Long> {
    @Query(value = "SELECT * FROM dsebd.txn_history n WHERE n.Company_Name like %:CompanyName% and (:fromDate is null or :toDate is null or(n.date>=:fromDate and n.date<=:toDate)) ORDER BY n.id desc",nativeQuery = true)
    public List<TransactionHistory> findByCNAndDate(@RequestParam("CompanyName") String CompanyName,
                                                    @RequestParam("fromDate") String fromDate,
                                                    @RequestParam("toDate") String toDate);

    @Query(value = "SELECT * FROM dsebd.txn_history n WHERE n.Company_Name like %:name% ORDER BY n.id desc",nativeQuery = true)
    public List<TransactionHistory> findByCN(@RequestParam("name") String name);

    @Query(value = "SELECT * FROM dsebd.txn_history n WHERE n.date between :fromDate and :toDate ORDER BY n.id desc limit 10",nativeQuery = true)
    public List<TransactionHistory> findByDate(@RequestParam("fromDate") String fromDate,
                                               @RequestParam("toDate") String toDate);
            ;



}
