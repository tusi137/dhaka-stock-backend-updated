package stockbackend.stockbackend.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="trendingNews_newsmodel",schema = "dsebd")
public class trendingNews_newsmodel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_native")
    @GenericGenerator(name = "id_native", strategy = "native")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "company_name",nullable = false)
    private String company_name;

    @Column(name = "category",nullable = false)
    private String category;

    @Lob
    @Column(name = "news_details",nullable = false,length=512)
    private String news_details ;

    @Column(name = "news_source",nullable = false)
    private String news_source;

    @Column(name = "news_date",nullable = false)
    private Date news_date;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNews_details() {
        return news_details;
    }

    public void setNews_details(String news_details) {
        this.news_details = news_details;
    }

    public String getNews_source() {
        return news_source;
    }

    public void setNews_source(String news_source) {
        this.news_source = news_source;
    }

    public Date getNews_date() {
        return news_date;
    }

    public void setNews_date(Date news_date) {
        this.news_date = news_date;
    }


}
