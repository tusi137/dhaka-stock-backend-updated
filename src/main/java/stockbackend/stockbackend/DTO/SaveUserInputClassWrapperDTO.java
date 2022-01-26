package stockbackend.stockbackend.DTO;

public class SaveUserInputClassWrapperDTO {


    public String getBuying_price_update() {
        return buying_price_update;
    }

    public void setBuying_price_update(String buying_price_update) {
        this.buying_price_update = buying_price_update;
    }

    private String buying_price_update;
    float amount=Float.parseFloat(getBuying_price_update());
}
