package com.example.pfebackend;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class PfebackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfebackendApplication.class, args);
	}

	/*@Bean
	ApplicationRunner ftpService(){
		return args -> {

			FtpServerFactory serverFactory = new FtpServerFactory();
			ListenerFactory factory = new ListenerFactory();
			factory.setPort(2221);
			PropertiesUserManagerFactory userManagerFactory = new PropertiesUserManagerFactory();
			userManagerFactory.setFile(new File("C:/Users/ASUS/PfeProject/pfebackend/src/main/resources/users.properties"));
			UserManager userManager = userManagerFactory.createUserManager();
			iniUsers(userManager);
			serverFactory.setUserManager(userManager);
			serverFactory.addListener("default",factory.createListener());
			FtpServer server = serverFactory.createServer();
			server.start();
		};
	}
	private static void iniUsers(UserManager userManager) throws Exception{
		var root = new File("C:/Users/ASUS/Bureau/images.jpg");
		for(var userName : Set.of("maryem","bb","cc")){
			var user = new BaseUser();
			user.setEnabled(true);
			user.setName(userName);
			user.setPassword("12345");
			user.setAuthorities(List.of(new WritePermission("/")));
			user.setHomeDirectory(root.getAbsolutePath());
			userManager.save(user);

		}
	}*/
}
