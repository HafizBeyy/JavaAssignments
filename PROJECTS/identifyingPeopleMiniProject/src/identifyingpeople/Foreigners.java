package identifyingpeople;

public class Foreigners extends Citizens {
    // ? bilgi
    {

        // ? ^^^ extends yazmak bu class'ın diğerinin uzantısı yani aynı şeyleri bunun
        // ? da içerdiğini gösterir
    }

    private String tempCreditCardNo;
    private String tempCreditCardpsswd;

    public String getTempCreditCardpsswd() {
        return this.tempCreditCardpsswd;
    }

    public void setTempCreditCardpsswd(String tempCreditCardpsswd) {
        this.tempCreditCardpsswd = tempCreditCardpsswd;
    }

    public String getTempCreditCardNo() {

        return this.tempCreditCardNo;

    }

    public void setTempCreditCardNo(String tempCreditCardNo) {

        this.tempCreditCardNo = tempCreditCardNo;

    }

}
