package com.photography.lithuanian_prees_photography.fakedata;

import com.photography.lithuanian_prees_photography.entity.User;
import com.photography.lithuanian_prees_photography.enums.Role;
import com.photography.lithuanian_prees_photography.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GenerateData implements CommandLineRunner {
    private final UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        generateUsers();
    }
    private void generateUsers (){
        User user = User.builder()
                .email("admin@admin.com")
                .password("1234")
                .role(Role.ADMIN)
                .firstName("Adminas")
                .lastName("Adminaitis")
                .institution("Administration")
                .isFreelance(false)
                .isNonLocked(true)
                .phoneNumber("911")
                .isEnabled(true)
                .birthYear(1990)
                .build();
        User user2 = User.builder()
                .email("jury@jury.com")
                .password("1234")
                .role(Role.JURY)
                .firstName("Jury")
                .lastName("Juryte")
                .institution("Jurystai")
                .isFreelance(false)
                .isNonLocked(true)
                .phoneNumber("112")
                .isEnabled(true)
                .birthYear(1990)
                .build();
        User user3 = User.builder()
                .email("user@user.com")
                .password("1234")
                .role(Role.USER)
                .firstName("User")
                .lastName("Useris")
                .institution("Useriai")
                .isFreelance(false)
                .isNonLocked(true)
                .phoneNumber("777")
                .isEnabled(true)
                .birthYear(1990)
                .build();
        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}
