package stockbackend.stockbackend.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

public class SaveUserInputClassDTO {



    private float buying_price;
    private String update_date;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    private String user_name;

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public float getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(float buying_price) {
        this.buying_price = buying_price;
    }


}
