package br.com.security.model;

import br.com.security.repository.UserRepository;
import br.com.security.utils.EStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Locale;

@Component
public class DefaultUserInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DefaultUserInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.FRENCH);
         
        User defaultUser = new User();
           defaultUser.setNom("Gueye");
           defaultUser.setPrenom("Lamine");
           defaultUser.setEmail("DRH@ugb.edu.sn");
           defaultUser.setPassword(passwordEncoder.encode("password"));
           defaultUser.setTelephone("777000000");
           defaultUser.setERole(ERole.ADMIN);
           defaultUser.setStatus(EStatus.ACTIVE);
           defaultUser.setNaissance(dateFormat.parse("05/02/2005"));
           userRepository.save(defaultUser);
           
    }
}
