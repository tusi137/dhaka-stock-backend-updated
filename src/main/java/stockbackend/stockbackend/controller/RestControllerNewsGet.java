package stockbackend.stockbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stockbackend.stockbackend.entity.trendingNews_newsmodel;
import stockbackend.stockbackend.service.GetNewsDetailsService;

import java.text.ParseException;
import java.util.List;

@RestController
public class RestControllerNewsGet {

    @Autowired
    private GetNewsDetailsService getNewsDetailsService;


    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/get/news/details",consumes = "application/json",produces = "application/json")
    public List<trendingNews_newsmodel> getNewsDetails() throws ParseException {
        return getNewsDetailsService.findByNews();
    }
}
