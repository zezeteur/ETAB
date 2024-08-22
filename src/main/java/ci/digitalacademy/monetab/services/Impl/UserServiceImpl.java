package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

  //  private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User save(User user) {

        return userRepository.save(user);
    }

    @Override
public User update(User user) {

        log.debug("Request to update user{}", user);

//return findOne.findById(user.getId())
 //               .map(existingUser->{
//existingUser.setPassword(user.getPassword());
  //                  existingUser.setPseudo(user.getPseudo());
//return existingUser;
  //              }).map((existingUser-> {
   //                 return save(existingUser);
//}).orElseThrow(() -> new IllegalArgumentException());

        Optional<User> optionalUser = findOne(user.getId()); //recuperation dun user
        if (optionalUser.isPresent()) { //verification de l'existence dun contenu
            User userToUpdate = optionalUser.get(); //declaration et affectation dun user
            userToUpdate.setPseudo(user.getPseudo()); // mise a jour du pseudo
            userToUpdate.setPassword(userToUpdate.getPassword()); // mise a jour du mot de passe
            return save(userToUpdate); // enregistrement de l'utilisateur modifie

        }
        else {
            throw new IllegalArgumentException();
        }

    }



    @Override
    public Optional<User> findOne(Long id) {
        log.debug("Request to findOne user{}", id);

        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        log.debug("Request to findAll users");

        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete user{}", id);

        userRepository.deleteById(id);

    }
}
