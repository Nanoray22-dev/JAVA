package live.live.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    private userRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User createUser(@ResquetBody User user){
        return userRepository.save(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        User existingUser = userRepository.findById(id).get();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }
  
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        try{
            userRepository.deleteById(id);
            return " User delete  successfully";
        } catch (Exception e){
            //TODO: handle exception
            return "User not found"; 
        }
    }

}