package com.Excelr.Users_info.Controller;

import com.Excelr.Users_info.entity.Userinfo;
import com.Excelr.Users_info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduders")
    public Userinfo addusers(@RequestBody Userinfo userinfo){
        return userService.addUsers(userinfo);
    }

    @GetMapping("/users")
    public List<Userinfo> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("job/{jobid}")
    public ResponseEntity<List<Userinfo>>getusersByJobid(@PathVariable("jobid") long jobid){
        List<Userinfo> users = userService.getUsersByJobid(jobid);
        if(users.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }

}
