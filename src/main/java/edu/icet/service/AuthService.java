package edu.icet.service;

import edu.icet.model.dto.User;

import java.sql.SQLException;

public interface AuthService {

    User authenticate(String username, String password) throws SQLException;
}

