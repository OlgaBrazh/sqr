import ru.netology.sqr.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.calcSQR(200, 300);
        System.out.println(count);
    }
}
