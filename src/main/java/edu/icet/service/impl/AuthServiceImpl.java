package edu.icet.service.impl;

import edu.icet.model.dto.User;
import edu.icet.repository.UserRepository;
import edu.icet.repository.impl.UserRepositoryImpl;
import edu.icet.service.AuthService;

import java.sql.SQLException;

public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl() {
        this(new UserRepositoryImpl());
    }

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User authenticate(String username, String password) throws SQLException {
        if (username == null || username.trim().isEmpty()) return null;
        if (password == null || password.isEmpty()) return null;

        User user = userRepository.findByUsername(username);
        if (user == null) return null;

        return password.equals(user.getPassword()) ? user : null;
    }
}

