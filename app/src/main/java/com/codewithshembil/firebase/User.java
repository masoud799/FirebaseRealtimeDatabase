package com.codewithshembil.firebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Masoud Mokhtari on 10/27/2019.
 * www.codewithshembil.com
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}