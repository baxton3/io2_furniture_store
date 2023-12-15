package demo.demo.controller;

import demo.demo.dto.request.AppUserRequest;
import demo.demo.dto.response.AppUserResponse;
import demo.demo.entity.AppUser;
import demo.demo.mapper.AppUserMapper;
import demo.demo.service.AppUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final AppUserService appUserService;
    private final AppUserMapper appUserMapper;

    public UserController(AppUserService appUserService, AppUserMapper appUserMapper) {
        this.appUserService = appUserService;
        this.appUserMapper = appUserMapper;
    }

    @GetMapping("get")
    public List<AppUserResponse> getAppUsers() {
        return appUserService.getAppUsers()
                .stream()
                .map(appUserMapper::mapToResponse)
                .toList();
    }

    @PostMapping("add")
    public void addAppUser(@RequestBody AppUserRequest appUserRequest) {
        AppUser appUser = appUserMapper.mapToEntity(appUserRequest);
        appUserService.addNewUser(appUser);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        appUserService.deleteUser(userId);
    }
}
