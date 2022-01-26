package stockbackend.stockbackend.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stockbackend.stockbackend.entity.trendingNews_newsmodel;

import java.util.List;

@Repository
@Qualifier("ReadFromNewsRepsitory")
public interface ReadFromNewsRepsitory extends JpaRepository<trendingNews_newsmodel,Long>{

    @Query(value="select * from dsebd.trendingNews_newsmodel m order by m.id desc",nativeQuery = true)
    List<trendingNews_newsmodel>findByNews();

}
