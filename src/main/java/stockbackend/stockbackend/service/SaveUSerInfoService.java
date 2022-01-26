package stockbackend.stockbackend.service;

import org.springframework.web.client.HttpClientErrorException;
import stockbackend.stockbackend.DTO.SaveUserInputClassWrapperDTO;
import stockbackend.stockbackend.entity.SaveUserInput;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface SaveUSerInfoService {
    public SaveUserInput addUserInput(SaveUserInput saveUserInput) throws HttpClientErrorException.NotAcceptable;
    public void updateUserBuyingPrice(String company_name, float buying_price, String update_date,String user_name);
    public void deleteByCompanyName(String company_name);



}
