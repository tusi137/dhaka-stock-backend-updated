package stockbackend.stockbackend.service;

import stockbackend.stockbackend.entity.trendingNews_newsmodel;
import stockbackend.stockbackend.service.impl.GetNewsDetailsImpl;

import java.util.List;

public interface GetNewsDetailsService {
    List<trendingNews_newsmodel>findByNews();
}
