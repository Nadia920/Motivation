package by.bsuir.management.security;

import by.bsuir.management.models.Employees;
import by.bsuir.management.services.EmployeesService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailService implements UserDetailsService {

    private final EmployeesService employeesService;

    public CustomUserDetailService(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Employees> optionalUser = employeesService.findByLogin(login);

        optionalUser
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return optionalUser
                .map(CustomUserDetail::new).get();
    }
}
