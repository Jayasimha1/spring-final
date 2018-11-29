package com.bellinfo.details.user.Service;

import com.bellinfo.details.user.Repository.UserDetailsRepository;
import com.bellinfo.details.user.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    UserDetailsRepository userDetailsRepository;


    public void addUserDetails(UserDetails userDetails) {

        userDetailsRepository.addUserDetails(userDetails);



    }
}
