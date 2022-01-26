package stockbackend.stockbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stockbackend.stockbackend.DTO.SaveUserInputClassDTO;
import stockbackend.stockbackend.DTO.SaveUserInputClassWrapperDTO;
import stockbackend.stockbackend.customException.HttpResponse;
import stockbackend.stockbackend.customException.UserNotFoundException;
import stockbackend.stockbackend.entity.SaveUserInput;
import stockbackend.stockbackend.service.SaveUSerInfoService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@RestController
public class RestControllerForSaveInfo {

    @Autowired
    private SaveUSerInfoService saveUSerInfoService;

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/user/input/save",produces="application/json" ,consumes = "application/json")
    public SaveUserInput saveUserInput(@RequestBody SaveUserInput saveUserInput){
        System.out.println("USer name is: "+saveUserInput.getCompany_Name());
        String buying_price=Float.toString(saveUserInput.getSelling_Price());
        System.out.println("buying price is: "+saveUserInput.getBuying_price());
        if(buying_price=="0.0") {
            throw new UserNotFoundException("Buying Price Can't be null");
        }
        if(saveUserInput.getCompany_Name()=="") {
            throw new UserNotFoundException("Company Name Can't be null");
        }
        return saveUSerInfoService.addUserInput(saveUserInput);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/api/v1/user/input/update/buying/price",produces="application/json" ,consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody void updateQueryForBuyingPRice(@RequestParam(value = "company_name",required = true) String company_name,@RequestBody SaveUserInputClassDTO saveUserInputClassDTO) throws IOException {
        Map<String,String> response = new HashMap<String, String>();
        if(company_name!="") {
            response.put("OK","Given Input Values Updated Successfully");
            ResponseEntity.accepted().body(response);
            new HttpResponse();
        }
        else
            throw new UserNotFoundException("Customer name can't be empty for update operation");

         saveUSerInfoService.updateUserBuyingPrice(company_name, saveUserInputClassDTO.getBuying_price(),saveUserInputClassDTO.getUpdate_date(),saveUserInputClassDTO.getUser_name());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/v1/user/info/delete",produces="application/json" ,consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void deleteByCompanyName(@RequestParam(value = "company_name",required = true)String company_Name){
        if (company_Name==""){
            throw new UserNotFoundException("Customer name can't be empty for delete operation");
        }
        saveUSerInfoService.deleteByCompanyName(company_Name);
    }

}
