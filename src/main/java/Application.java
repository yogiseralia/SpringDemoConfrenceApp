import com.demo.service.SpeakerService;
import com.demo.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll());
    }
}
