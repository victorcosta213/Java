package com.vcm.app.service;

import com.vcm.app.dto.UserDTO;
import com.vcm.app.model.User;
import com.vcm.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserDTO> getAll() {
        List<User> usuarios = userRepository.findAll();
        return usuarios
                .stream()
                .map(UserDTO::convert)
                .collect(Collectors.toList());
    }

    public UserDTO findById(long userId) {
        return userRepository
                .findById(userId).orElseThrow(() -> new
                        RuntimeException());
    }

}
