package cn.itcast.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity//表示当前类是一个实体类
@Table(name = "cst_customer")//建立当前实体类和表之间的对应关系
public class Customer implements Serializable {

    @Id//表明当前私有属性是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//指定主键的生成策略
    @Column(name = "cust_id")//指定和数据库表中的cust_id列对应
    private Long custId;
    @Column(name = "cust_name")//指定和数据库表中的cust_name列对应
    private String custName;
    @Column(name = "cust_source")//指定和数据库表中的cust_source列对应
    private String custSource;
    @Column(name = "cust_industry")//指定和数据库表中的cust_industry列对应
    private String custIndustry;
    @Column(name = "cust_level")//指定和数据库表中的cust_level列对应
    private String custLevel;
    @Column(name = "cust_address")//指定和数据库表中的cust_address列对应
    private String custAddress;
    @Column(name = "cust_phone")//指定和数据库表中的cust_phone列对应
    private String custPhone;
    @OneToMany(targetEntity = LinkMan.class)
    @JoinColumn(name = "lkm_cust_id", referencedColumnName = "cust_id")
    private Set<LinkMan> linkmans;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public Set<LinkMan> getLinkmans() {
        return linkmans;
    }

    public void setLinkmans(Set<LinkMan> linkmans) {
        this.linkmans = linkmans;
    }
}
