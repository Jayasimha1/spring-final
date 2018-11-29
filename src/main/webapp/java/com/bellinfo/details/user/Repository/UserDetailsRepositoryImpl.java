package com.bellinfo.details.user.Repository;

import com.bellinfo.details.user.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }



    public void addUserDetails(UserDetails userDetails) {

        getSession().save(userDetails);

    }
}
