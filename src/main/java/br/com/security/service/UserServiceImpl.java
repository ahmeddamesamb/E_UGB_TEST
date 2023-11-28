package br.com.security.service;

import br.com.security.model.ERole;
import br.com.security.model.User;
import br.com.security.repository.UserRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static javax.print.attribute.Size2DSyntax.MM;
import static javax.swing.text.html.HTML.Tag.DD;

@Log4j2
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setERole(ERole.ADMIN);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User userRequest) {

        User user = userRepository
            .findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "La tentative de mise a jour du user na pas aboutit"
                )
            );
        user.setNom(userRequest.getNom());
        user.setPrenom(userRequest.getPrenom());
        user.setNaissance(userRequest.getNaissance());
        user.setEmail(userRequest.getEmail());
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setTelephone(userRequest.getTelephone());
        user.setERole(ERole.ADMIN);
        return userRepository.save(user);

    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("l'user que vous tenter de supprimer n existe pas"));
        userRepository.delete(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResourceNotFoundException("l'user que vous checher n existe pas!!!");
        }
    }

}
