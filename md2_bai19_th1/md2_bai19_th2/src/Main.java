import ra.AccountExample;

public class Main {
    public static void main(String[] args) {
String regex = "_abc123";
        AccountExample ac = new AccountExample();
        boolean check = ac.validate(regex);
        System.out.println(check);

    }
}