package com.gino.springsecuritybasics.service;

import com.gino.springsecuritybasics.dto.LoginDto;
import com.nimbusds.jose.JOSEException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public interface IAuthService {
    String login(LoginDto loginDto) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException;
}
