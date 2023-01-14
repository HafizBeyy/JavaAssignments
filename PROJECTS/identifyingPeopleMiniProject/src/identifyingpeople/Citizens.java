package identifyingpeople;

public class Citizens {
    private String tcNo;
    private String walletNo;
    private String bornDate;
    private String fullName;

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBornDate() {
        return this.bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getWalletNo() {
        return this.walletNo;
    }

    public void setWalletNo(String walletNo) {
        this.walletNo = walletNo;
    }

    public String getTcNo() {
        return this.tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

}
