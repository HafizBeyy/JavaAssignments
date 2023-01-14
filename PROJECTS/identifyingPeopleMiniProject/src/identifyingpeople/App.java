package identifyingpeople;

public class App {
    public static void main(String[] args) throws Exception {
        Citizens local1 = new Citizens();
        Citizens local2 = new Citizens();
        Citizens local3 = new Citizens();
        Foreigners outer1 = new Foreigners();
        Foreigners outer2 = new Foreigners();

        local1.setFullName("salih kaya ");
        local1.setTcNo("89524610457");
        local1.setBornDate("15422000");
        local1.setWalletNo("1414");

        local2.setFullName("ahmet kaya");
        local2.setTcNo("64556325678");
        local2.setBornDate("01231985");
        local2.setWalletNo("5648");

        local3.setFullName("ayşe kaya");
        local3.setTcNo("21364597812");
        local3.setBornDate("31121999");
        local3.setWalletNo("4867");

        outer1.setFullName("alexander carolina");
        outer1.setTcNo("temp 65149898700");
        outer1.setBornDate("12012012");
        outer1.setWalletNo("6457");
        outer1.setTempCreditCardNo("213645");
        outer1.setTempCreditCardpsswd("5916");

        outer2.setFullName("susan clerance");
        outer2.setTcNo("temp 65198798700");
        outer2.setBornDate("16112012");
        outer2.setWalletNo("6987");
        outer2.setTempCreditCardNo("513685");
        outer2.setTempCreditCardpsswd("4580");
        Citizens[] a = { local1, local2, local3, outer1, outer2 };
        for (Citizens everyone : a) {
            String lookingFor = everyone.getFullName();
            if (lookingFor.indexOf("ahmet kaya") == 0) {
                System.out.println("bulundu");
            } else {
                System.out.println("bluunamadı");
            }
        }

    }
}
