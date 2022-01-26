package stockbackend.stockbackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name="txn_history",schema = "dsebd")
public class TransactionHistory {


    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name = "date",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date txnDate;

    @Column(name = "Company_Name",nullable = false)
    private String cmName;

    @Column(name = "Yesterday_Closing_Price",nullable = false)
    private float yClosingPrice;

    @Column(name = "Last_Trading_Price",nullable = false)
    private float lTrendingPrice;

    @Column(name = "Change_percentage",nullable = false)
    private float changePer;

    @Column(name = "Change_value",nullable = false)
    private float changeValue;

    @Column(name = "Market_Capitalization_mn",nullable = false)
    private float marketCapitalizationMN;

    @Column(name = "Day_Volume_Nos",nullable = false)
    private String dayVolumeNos;

    @Column(name = "Last_Update",nullable = false)
    private String lastUpdate;

    @Column(name = "Day_Value_mn",nullable = false)
    private float dayVolumeMN;

    @Column(name = "52_Weeks_Moving_Range",nullable = false)
    private String weeks52MovingRange;

    @Column(name = "Adjusted_Opening_Price",nullable = false)
    private float adjustedOpening;

    @Column(name = "Opening_Price",nullable = false)
    private float openingPrice;

    @Column(name = "Closing_Price",nullable = false)
    private float closingPrice;

    @Column(name = "Day_Trade_Nos",nullable = false)
    private float dayTradeNos;

    public float getyClosingPrice() {
        return yClosingPrice;
    }

    public void setyClosingPrice(float yClosingPrice) {
        this.yClosingPrice = yClosingPrice;
    }

    public float getlTrendingPrice() {
        return lTrendingPrice;
    }

    public void setlTrendingPrice(float lTrendingPrice) {
        this.lTrendingPrice = lTrendingPrice;
    }

    public float getChangePer() {
        return changePer;
    }

    public void setChangePer(float changePer) {
        this.changePer = changePer;
    }

    public float getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(float changeValue) {
        this.changeValue = changeValue;
    }

    public float getMarketCapitalizationMN() {
        return marketCapitalizationMN;
    }

    public void setMarketCapitalizationMN(float marketCapitalizationMN) {
        this.marketCapitalizationMN = marketCapitalizationMN;
    }

    public String getDayVolumeNos() {
        return dayVolumeNos;
    }

    public void setDayVolumeNos(String dayVolumeNos) {
        this.dayVolumeNos = dayVolumeNos;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public float getDayVolumeMN() {
        return dayVolumeMN;
    }

    public void setDayVolumeMN(float dayVolumeMN) {
        this.dayVolumeMN = dayVolumeMN;
    }

    public String getWeeks52MovingRange() {
        return weeks52MovingRange;
    }

    public void setWeeks52MovingRange(String weeks52MovingRange) {
        this.weeks52MovingRange = weeks52MovingRange;
    }

    public float getAdjustedOpening() {
        return adjustedOpening;
    }

    public void setAdjustedOpening(float adjustedOpening) {
        this.adjustedOpening = adjustedOpening;
    }

    public float getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(float openingPrice) {
        this.openingPrice = openingPrice;
    }

    public float getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(float closingPrice) {
        this.closingPrice = closingPrice;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }


    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName;
    }

    public float getDayTradeNos() {
        return dayTradeNos;
    }

    public void setDayTradeNos(float dayTradeNos) {
        this.dayTradeNos = dayTradeNos;
    }
}
