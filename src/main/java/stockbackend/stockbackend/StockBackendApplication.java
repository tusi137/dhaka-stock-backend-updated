package stockbackend.stockbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import stockbackend.stockbackend.controller.RestControllerForSaveInfo;
import stockbackend.stockbackend.controller.RestControllerNewsGet;
import stockbackend.stockbackend.controller.RestControllerTxnHistory;
import stockbackend.stockbackend.controller.RestEndpointsController;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "stockbackend.stockbackend.repositories")
@EntityScan(basePackages = "stockbackend.stockbackend.entity")

public class StockBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockBackendApplication.class, args);
    }
}
