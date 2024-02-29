package org.sample.aclsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;
import org.springframework.security.acls.model.AclService;

import java.nio.file.attribute.AclEntry;

@SpringBootApplication
public class AclSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AclSecurityApplication.class, args);
//		AclService
//		JdbcMutableAclService
	}

}
