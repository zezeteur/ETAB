package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        log.debug("Request to save User{}", user);

        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.debug("Request to update User{}", user);

        return null;
    }

    @Override
    public Optional<User> findOne(Long id) {
        log.debug("Request to findOne User{}", id);

        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        log.debug("Request to findAll users");

        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete User{}", id);

        userRepository.deleteById(id);
    }
}
