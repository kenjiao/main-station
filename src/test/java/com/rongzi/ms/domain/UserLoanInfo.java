package com.rongzi.ms.domain;

/**
 * Created by Yuan on 2017/7/7.
 */
public class UserLoanInfo {

    private String username;
    private String telephone;
    private String identity;
    private Integer loanMoney;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(Integer loanMoney) {
        this.loanMoney = loanMoney;
    }

    @Override
    public String toString() {
        return "UserLoanInfo{" +
                "username='" + username + '\'' +
                ", telephone='" + telephone + '\'' +
                ", identity='" + identity + '\'' +
                ", loanMoney='" + loanMoney + '\'' +
                '}';
    }
}
