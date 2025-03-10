//package com.marrymates.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.marrymates.model.PasswordResetToken;
//
//public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
//    PasswordResetToken findByToken(String token);
//}


package com.marrymates.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marrymates.model.PasswordResetToken;
import com.marrymates.model.User; // Make sure to import your User class

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    PasswordResetToken findByToken(String token);
    
    // New method to find a token by User
    Optional<PasswordResetToken> findByUser(User user);
}
