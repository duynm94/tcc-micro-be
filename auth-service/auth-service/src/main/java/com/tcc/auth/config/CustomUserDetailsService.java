package com.tcc.auth.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.tcc.auth.entity.UserCredential;
import com.tcc.auth.repository.UserCredentialRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserCredentialRepository userCredentialRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserCredential> credentialOpt = userCredentialRepository.findByName(username);
		if (credentialOpt == null || !credentialOpt.isPresent()) {
			throw new UsernameNotFoundException("User not found with name :" + username);
		}
		UserDetails userDetails =  credentialOpt.map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + username));
		return userDetails;
	}

}
