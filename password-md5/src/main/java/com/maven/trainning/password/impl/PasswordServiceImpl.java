package com.maven.trainning.password.impl;

import org.springframework.stereotype.Service;

import com.maven.trainning.password.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {

	public String algorithm() {
		return "MD5";
	}

}
