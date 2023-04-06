package tn.iset;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tn.iset.dao.ArticleRepository;
import tn.iset.dao.CommandLineRepository;
import tn.iset.dao.CommandRepository;

import tn.iset.dao.UserInformationsRepository;
import tn.iset.dao.UserRepository;
import tn.iset.entities.Article;
import tn.iset.entities.Command;
import tn.iset.entities.CommandLine;

import tn.iset.entities.Payement;
import tn.iset.entities.UserInformations;
import tn.iset.entities.Userr;

@SpringBootApplication
public class ExerciceCours2Application {
	 public static void main(String[] args) {
	        ApplicationContext context = SpringApplication.run(ExerciceCours2Application.class, args);
	        
	        // Récupération des repositories
	        UserRepository userRepository = context.getBean(UserRepository.class);
	        UserInformationsRepository userInformationsRepository = context.getBean(UserInformationsRepository.class);
	        ArticleRepository articleRepository = context.getBean(ArticleRepository.class);
	        CommandRepository commandeRepository = context.getBean(CommandRepository.class);
	        CommandLineRepository commandeLineRepository = context.getBean(CommandLineRepository.class);
	        
	        // Ajout d'un utilisateur avec des informations utilisateur
	        UserInformations userInformations = new UserInformations();
	        userInformations.setAdresse("10 rue des Lilas");
	        userInformations.setCity("Paris");
	        userInformations.setEmail("johndoe@example.com");
	        userInformations.setPhoneNumber("0123456789");
	        userInformationsRepository.save(userInformations);
	        
	        Userr user = new Userr();
	        user.setLogin("johndoe");
	        user.setPassword("password");
	        user.setConnectionNumber(0);
	        user.setUserrinformation(userInformations);
	        userRepository.save(user);
	        
	        // Ajout d'un article avec une commande ligne
	        Article article = new Article();
	        article.setDescription("Ordinateur portable");
	        article.setBrand("HP");
	        article.setPrice(800.0);
	        articleRepository.save(article);
	        
	    /*    Command commande = new Command();
	        commande.setCommandeDate(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
	        commande.setPayement(new Payement());
	        commande.setUtilisateur(user);
	        commandeRepository.save(commande);
	        
	        CommandLine commandeLine = new CommandLine();
	        commandeLine.setQuantity(2L);
	        commandeLine.setArticle(article);
	        commandeLine.setCommand(commande);
	        commandeLineRepository.save(commandeLine);*/
	    }

}
