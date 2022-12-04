import ru.netology.sqr.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int expected = 3;
        int min = 100;
        int max = 10000;
        int actual = service.calcSQR(min, max);
        System.out.println(actual);
    }
}