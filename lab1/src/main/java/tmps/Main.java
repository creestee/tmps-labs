package tmps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import tmps.prototype.ProtoFalse;
import tmps.prototype.ProtoTrue;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }
}
