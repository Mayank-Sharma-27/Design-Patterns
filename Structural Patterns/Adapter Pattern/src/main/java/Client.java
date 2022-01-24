import com.HotAirBalloonAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@RequiredArgsConstructor
public class Client implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    public static void main(String[] args) {
        //    HotAirBalloon hotAirBalloon = new HotAirBalloon();
        new SpringApplicationBuilder(Client.class)
                .run(args);
    }

    @Override
    public void run(String... strings) throws Exception {
        HotAirBalloonAdapter hotAirBalloonAdapter = applicationContext.getBean(HotAirBalloonAdapter.class);
        hotAirBalloonAdapter.fly();
    }
}
