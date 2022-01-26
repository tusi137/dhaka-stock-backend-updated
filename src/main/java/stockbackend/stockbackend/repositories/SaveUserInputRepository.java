package stockbackend.stockbackend.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import stockbackend.stockbackend.DTO.SaveUserInputClassWrapperDTO;
import stockbackend.stockbackend.entity.SaveUserInput;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Repository
@Qualifier(value = "SaveUserInputRepository")
public interface SaveUserInputRepository extends JpaRepository<SaveUserInput,Long> {
    @Transactional
    @Modifying
    @Query(value = "update dsebd.bo_user_profile n set n.buying_price=:buying_price,n.update_date=:update_date,n.user_name=:user_name WHERE n.company_Name=:company_name",nativeQuery = true)
    public void updateUserBuyingPrice(@RequestParam("company_name") String company_name, float buying_price,String update_date,String user_name);

    @Transactional
    @Modifying
    @Query(value = "delete from dsebd.bo_user_profile WHERE company_Name=:company_name",nativeQuery = true)
    public void deleteByCompanyName(@RequestParam("company_name") String company_name);


}
