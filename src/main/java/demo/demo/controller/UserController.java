package demo.demo.controller;

import demo.demo.entity.AppUser;
import demo.demo.repository.AppUserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final AppUserRepo appUserRepo;

    public UserController(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    @GetMapping("get")
    public List<AppUser> getAppUsers() {
        return appUserRepo.findAll();
    }

    @PostMapping("add")
    public AppUser addAppUser(@RequestBody AppUser appUser) {
        return appUserRepo.save(appUser);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        appUserRepo.deleteById(userId);
    }
}
