package stockbackend.stockbackend.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="dsebd_users",schema = "dsebd")
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_native")
    @GenericGenerator(name = "id_native", strategy = "native")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    //@NotBlank(message = "Company Name can't be null")
    @Column(name = "user_name",nullable = false)
    private String Company_Name;

    @Column(name = "mobile",nullable = false)
    private String mobile;


    @Column(name = "password",nullable = false)
    private String password;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
