package com.kosmetolog.admin.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kosmetolog.entity.Role;
import com.kosmetolog.entity.User;


public class KosmetologUserDetails implements UserDetails {
	private static final long serialVersionUID = 1L;
	private User user;
	
	
	public KosmetologUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Role> roles = user.getRoles();
		
		List<SimpleGrantedAuthority> authories = new ArrayList<>();
		
		for (Role role : roles) {
			authories.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		return authories;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return user.isEnabled();
	}
	
	public String getFullname() {
		return this.user.getFirstname() + " " + this.user.getLastname();
	}
	
	public void setFirstName(String firstname) {
		this.user.setFirstname(firstname);
	}

	public void setLastName(String lastname) {
		this.user.setLastname(lastname);
	}	
	
	public boolean hasRole(String roleName) {
		return user.hasRole(roleName);
	}
}
