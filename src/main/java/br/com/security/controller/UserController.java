package br.com.security.controller;

import br.com.security.dto.PassagerDto;
import br.com.security.dto.UserDto;
import br.com.security.model.Passager;
import br.com.security.model.User;
import br.com.security.service.UserService;
import br.com.security.service.mapper.UserMapStruct;
import br.com.security.utils.Endpoints;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Endpoints.URL_APP)
@CrossOrigin("*")
public class UserController {
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final UserMapStruct userMapStruct;

    public UserController(ModelMapper modelMapper, UserService userService, UserMapStruct userMapStruct) {
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.userMapStruct = userMapStruct;
    }

    @GetMapping(Endpoints.URL_USER)
    public List<UserDto> getAllUser() {
        return userService.getAllUser().stream().map(user->modelMapper.map(user,UserDto.class)).collect(Collectors.toList());
    }

    // *****************************END DELETE METHOD*****************************
    // *****************************ADD METHOD*****************************
    @PostMapping(Endpoints.URL_USER)
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        User userResquest = userMapStruct.toEntity(userDto);
        User user = userService.createUser(userResquest);
        UserDto userResponse = userMapStruct.toDto(user);
        return ResponseEntity.ok().body(userResponse);
    }
    //GET USAGER & USERS BY ID

    @GetMapping(Endpoints.URL_USER_ONE_USER)
    public ResponseEntity<UserDto> getUserById(@PathVariable(name = "id") Long id) {
        User user = userService.getUserById(id);
        UserDto userResponse = userMapStruct.toDto(user);
        return ResponseEntity.ok().body(userResponse);

    }

    // *****************************UPDATE METHOD*****************************

    @PutMapping(Endpoints.URL_USER_ONE_USER)
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        User userResquest = userMapStruct.toEntity(userDto);
        User user = userService.updateUser(id, userResquest);
        UserDto userResponse = userMapStruct.toDto(user);
        return ResponseEntity.ok().body(userResponse);

    }
    // *****************************END UPDATE METHOD*****************************

    // *****************************DELETE METHOD*****************************

    @DeleteMapping(Endpoints.URL_USER_ONE_USER)
    public ResponseEntity<?> deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
