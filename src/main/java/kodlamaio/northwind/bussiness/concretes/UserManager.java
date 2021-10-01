/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.bussiness.concretes;

import kodlamaio.northwind.bussiness.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yahya
 */
@Service
public class UserManager implements UserService {

    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao=userDao;
    }
    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("kullanıcı eklendi.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User> (this.userDao.findByEmail(email),"kullanıcı bulundu");
    }
    
}
