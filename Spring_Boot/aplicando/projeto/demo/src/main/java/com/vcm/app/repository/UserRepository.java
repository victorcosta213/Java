package com.vcm.app.repository;

import com.vcm.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByCpf(String cpf);

    List<User> queryByNomeLike(String nome);
}
