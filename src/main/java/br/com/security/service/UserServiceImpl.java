package br.com.security.service;

import br.com.security.model.Role;
import br.com.security.model.User;
import br.com.security.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.ADMIN);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User userRequest) {

        User user = userRepository
            .findById((int) id)
            .orElseThrow(() ->
                new RuntimeException(
                    "La tentative de mise a jour du user na pas aboutit"
                )
            );
        user.setNom(user.getNom());
        user.setEmail(user.getEmail());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setTelephone(user.getTelephone());
        user.setRole(Role.ADMIN);
        return userRepository.save(userRequest);

    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById((int) id)
            .orElseThrow(() -> new ResourceNotFoundException("l'user que vous tenter de supprimer n existe pas"));
        userRepository.delete(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> result = userRepository.findById((int) id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResourceNotFoundException("l'user que vous checher n existe pas!!!");
        }
    }

}
