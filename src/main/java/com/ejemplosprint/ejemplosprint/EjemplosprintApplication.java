package com.ejemplosprint.ejemplosprint;
import java.time.LocalDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ejemplosprint.ejemplosprint.controllers.InfAprendiz;

@RestController
@SpringBootApplication
public class EjemplosprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplosprintApplication.class, args);
	}

	@GetMapping("/aprendiz")
	public InfAprendiz messageview(){
		return new InfAprendiz(LocalDateTime.now(), "Maria", "Avellaneda", "101885", "MAR");
	}
}
    
    
