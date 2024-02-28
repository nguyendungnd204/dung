package com.codewithDung.fullstackbackend.service;

import com.codewithDung.fullstackbackend.model.User;
import com.codewithDung.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UserRepository usersRepository;

    public UsersService(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User registerUser(String login,String password, String email )
    {
        if(login != null && password != null)
        {
            return null;
        }else
        {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setEmail(email);
            return usersRepository.save(user);

        }
    }
    //phuong thuc xac thuc
    public User authenticate(String login, String password)
    {
        //tim kiem lg,pass  cua nguoi dung ,truong hop khong tim thay tra ve null
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);

    }


}
