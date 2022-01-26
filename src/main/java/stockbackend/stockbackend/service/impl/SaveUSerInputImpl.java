package stockbackend.stockbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbackend.stockbackend.DTO.SaveUserInputClassWrapperDTO;
import stockbackend.stockbackend.customException.UserNotFoundException;
import stockbackend.stockbackend.entity.SaveUserInput;
import stockbackend.stockbackend.repositories.SaveUserInputRepository;
import stockbackend.stockbackend.service.SaveUSerInfoService;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class SaveUSerInputImpl implements SaveUSerInfoService {
    @Autowired
    private SaveUserInputRepository saveUserInputRepository;

    @Override
    public SaveUserInput addUserInput(SaveUserInput saveUserInput) {
        System.out.println(saveUserInput.getCompany_Name());
        String buying_price=Float. toString(saveUserInput.getBuying_price());
        if(saveUserInput.getCompany_Name()=="") {
            throw new UserNotFoundException("Company Name Can't be null");
        }
        if(buying_price=="") {
            throw new UserNotFoundException("Buying Price Can't be null");
        }
        return saveUserInputRepository.save(saveUserInput);
    }

    @Override
    public void updateUserBuyingPrice(String company_name, float buying_price,String update_date,String user_name) {
        String s=null;
        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            /*LocalDateTime strDate = LocalDateTime.parse(localDateTime.toString(), inputFormat);
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            s = strDate.format(outputFormat);
            System.out.println(s);*/

            s = localDateTime.format(inputFormat);

            update_date=s;
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("update date is:" +update_date);
         saveUserInputRepository.updateUserBuyingPrice(company_name,buying_price,update_date,user_name);
    }

    @Override
    public void deleteByCompanyName(String company_name) {
        saveUserInputRepository.deleteByCompanyName(company_name);
    }
}
