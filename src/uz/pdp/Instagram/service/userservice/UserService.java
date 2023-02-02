package uz.pdp.Instagram.service.userservice;

import uz.pdp.Instagram.model.User;
import uz.pdp.Instagram.service.BaseService;

public interface UserService extends BaseService<User> {
    User signIn(String gmail,String password);
    User signIn2(String phoneNumber,String password);
}
