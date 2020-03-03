package Lab_S4;

public class Main {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.addProduct(new Mobile("SamSung", "0112289", 2020));
        mb.guaranteeCheck();
    }
}
