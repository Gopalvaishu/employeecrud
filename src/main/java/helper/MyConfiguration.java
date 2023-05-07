package helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"controller","dto","sevice","dao","service"})
public class MyConfiguration {

	@Bean
	public EntityManager getEMF() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
//in the place of rq.getparameter instead of this we can use @RequestParam
//mvc provide faster way of doing things
//same jsp file we can reuse
//<form>---normal form in html
//<spring:form> --special form (if we done prefix as spring)