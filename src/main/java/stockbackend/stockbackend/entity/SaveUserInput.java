package stockbackend.stockbackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="bo_user_profile",schema = "dsebd")
public class SaveUserInput {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_native")
    @GenericGenerator(name = "id_native", strategy = "native")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    //@NotBlank(message = "Company Name can't be null")
    @Column(name = "company_Name",nullable = true)
    private String Company_Name;

    //@NotBlank(message = "Buying Price can't be null")
    @Column(name = "buying_price",nullable = false)
    private float Buying_price;

    @Column(name = "selling_Price",nullable = true)
    private float Selling_Price;

    @Column(name = "stock_Count",nullable = true)
    private int Stock_Count;

    @Column(name = "agent_commission",nullable = true)
    private float agent_commission;

    @Column(name = "buying_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date buying_date;

    @Column(name = "selling_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date selling_date;

    @Column(name = "bo_account",nullable = true)
    private String bo_account;

    @Column(name = "update_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date update_date;


    @Column(name = "user_name",nullable = true)
    private String user_name;

    public String getBo_account() {
        return bo_account;
    }

    public void setBo_account(String bo_account) {
        this.bo_account = bo_account;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public float getBuying_price() {
        return Buying_price;
    }

    public void setBuying_price(float suying_price) {
        Buying_price = suying_price;
    }

    public float getSelling_Price() {
        return Selling_Price;
    }

    public void setSelling_Price(float selling_Price) {
        Selling_Price = selling_Price;
    }

    public int getStock_Count() {
        return Stock_Count;
    }

    public void setStock_Count(int stock_Count) {
        Stock_Count = stock_Count;
    }

    public float getAgent_commission() {
        return agent_commission;
    }

    public void setAgent_commission(float agent_commission) {
        this.agent_commission = agent_commission;
    }

    public Date getBuying_date() {
        return buying_date;
    }

    public void setBuying_date(Date buying_date) {
        this.buying_date = buying_date;
    }

    public Date getSelling_date() {
        return selling_date;
    }

    public void setSelling_date(Date selling_date) {
        this.selling_date = selling_date;
    }

    public String getbo_account() {
        return bo_account;
    }

    public void setBO_accoun(String bo_account) {
        this.bo_account = bo_account;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }




}
