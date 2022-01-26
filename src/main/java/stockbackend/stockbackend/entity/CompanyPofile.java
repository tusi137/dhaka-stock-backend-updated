package stockbackend.stockbackend.entity;


import javax.persistence.*;

@Entity
@Table(name="company_profile",schema = "dsebd")
public class CompanyPofile {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "Company_Name",nullable = false)
    private String _cName;


    @Column(name = "Category",nullable = false)
    private String category;

    @Column(name = "Share_Holding",nullable = false)
    private String share_Holding;

    @Column(name = "Listing_Year",nullable = false)
    private String listing_Year;

    @Column(name = "Cash_Dividend",nullable = false)
    private String sash_Dividend;

    @Column(name = "Stock_Dividend",nullable = false)
    private String stock_Dividend;

    @Column(name = "Sector",nullable = false)
    private String sector;

    @Column(name = "EPS_2019",nullable = false)
    private float ePS_2019;

    @Column(name = "EPS_2020",nullable = false)
    private float ePS_2020;

    @Column(name = "Year_End",nullable = false)
    private String year_End;

    @Column(name = "Graph_Link",nullable = false)
    private String graph_Link;

    @Column(name = "Total_Stock",nullable = false)
    private float total_Stock;



    public String get_cName() {
        return _cName;
    }

    public void set_cName(String _cName) {
        this._cName = _cName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShare_Holding() {
        return share_Holding;
    }

    public void setShare_Holding(String share_Holding) {
        this.share_Holding = share_Holding;
    }

    public String getListing_Year() {
        return listing_Year;
    }

    public void setListing_Year(String listing_Year) {
        this.listing_Year = listing_Year;
    }

    public String getSash_Dividend() {
        return sash_Dividend;
    }

    public void setSash_Dividend(String sash_Dividend) {
        this.sash_Dividend = sash_Dividend;
    }

    public String getStock_Dividend() {
        return stock_Dividend;
    }

    public void setStock_Dividend(String stock_Dividend) {
        this.stock_Dividend = stock_Dividend;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public float getePS_2019() {
        return ePS_2019;
    }

    public void setePS_2019(float ePS_2019) {
        this.ePS_2019 = ePS_2019;
    }

    public float getePS_2020() {
        return ePS_2020;
    }

    public void setePS_2020(float ePS_2020) {
        this.ePS_2020 = ePS_2020;
    }

    public String getYear_End() {
        return year_End;
    }

    public void setYear_End(String year_End) {
        this.year_End = year_End;
    }

    public String getGraph_Link() {
        return graph_Link;
    }

    public void setGraph_Link(String graph_Link) {
        this.graph_Link = graph_Link;
    }

    public float getTotal_Stock() {
        return total_Stock;
    }

    public void setTotal_Stock(float total_Stock) {
        this.total_Stock = total_Stock;
    }






}
