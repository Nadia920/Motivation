package by.bsuir.management.security;

import by.bsuir.management.models.Employees;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetail extends Employees implements UserDetails {
    public CustomUserDetail(final Employees employee) {
        super(employee);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(getRoleEntity().getRole());
        return Collections.singleton(simpleGrantedAuthority);
    }

    public boolean isAdmin() {
        return getRoleEntity().getRole().equals("ROLE_ADMIN");
    }

    public boolean isClient() {
        return getRoleEntity().getRole().equals("ROLE_CLIENT");
    }

    public boolean isWorker() {
        return getRoleEntity().getRole().equals("ROLE_WORKER");
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getLogin();
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
        return true;
    }
}

