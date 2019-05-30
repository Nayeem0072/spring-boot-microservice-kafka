package com.jcombat.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ProfileApiController {
    @Autowired
    ProfileRepository profileRepository;

    @RequestMapping("/user/profiles")
    @ResponseBody
    public List<Profile> getRemoteProfileList(Model model) {
        return profileRepository.getAllProfiles();
    }
}