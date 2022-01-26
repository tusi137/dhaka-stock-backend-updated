package stockbackend.stockbackend.authorization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PassWordEncoder {
    @Bean
    public PasswordEncoder stockPassword() {
        return new BCryptPasswordEncoder();
    }
}
