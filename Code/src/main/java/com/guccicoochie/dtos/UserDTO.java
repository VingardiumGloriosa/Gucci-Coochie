package com.guccicoochie.dtos;

import com.guccicoochie.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    int id;
    String name;
    String bio;
    String location;

    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.bio = user.getBio();
        this.location = user.getLocation();
    }

    public UserDTO UserDTOfromUser(User user){
        return new UserDTO(user);
    }

    public static List<UserDTO> UserDTOSfromUser(Iterable<User> users){
        List<UserDTO> dtos = StreamSupport.stream(users.spliterator(), false)
                .map(movie -> new UserDTO(movie))
                .collect(Collectors.toList());
        return dtos;
    }

}
