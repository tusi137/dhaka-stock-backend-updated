package stockbackend.stockbackend.repositories;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import stockbackend.stockbackend.entity.CompanyPofile;

import java.util.List;

@Repository
@Qualifier(value = "ReadCPRepository")
public interface ReadCPRepository extends JpaRepository<CompanyPofile,Long> {
    /*@Transactional
    @Modifying*/
    @Query(value = "SELECT * FROM dsebd.company_profile n WHERE n.Company_Name like %:CompanyName% ORDER BY n.id desc",nativeQuery = true)
    public List<CompanyPofile>findBy_companyName(@RequestParam("CompanyName") String CompanyName);

    @Query(value = "SELECT * FROM dsebd.company_profile n order by n.id desc ",nativeQuery = true)
    public List<CompanyPofile> getAllData();
}
