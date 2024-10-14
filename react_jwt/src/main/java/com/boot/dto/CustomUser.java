package com.boot.dto;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CustomUser implements UserDetails{
	private Users user;
	
	public CustomUser(Users user) {
		this.user=user;
	}
	
//	권한 getter 메소드
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return user.getAuthList().stream()
				.map((auth) -> new SimpleGrantedAuthority(auth.getAuth()))
				.collect(Collectors.toList())
				;
	}

	@Override
	public String getPassword() {
		return user.getUserPw();
	}

	@Override
	public String getUsername() {
		return user.getUserId();
	}

}








