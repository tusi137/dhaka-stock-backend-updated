package stockbackend.stockbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stockbackend.stockbackend.entity.trendingNews_newsmodel;
import stockbackend.stockbackend.repositories.ReadFromNewsRepsitory;
import stockbackend.stockbackend.repositories.ReadTxnHistory;
import stockbackend.stockbackend.service.GetNewsDetailsService;

import java.util.List;

@Service
public class GetNewsDetailsImpl implements GetNewsDetailsService {
    @Autowired
    private ReadFromNewsRepsitory readFromNewsRepsitory;

    @Override
    public List<trendingNews_newsmodel> findByNews() {
        return readFromNewsRepsitory.findByNews();
    }
}
