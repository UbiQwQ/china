package blct.china.service.user.service;

import blct.china.common.util.ModelUtil;
import blct.china.service.user.dao.UserMapper;
import blct.china.service.user.entity.User;
import blct.china.service.user.entity.UserExample;
import blct.china.interfaces.user.service.UserService;
import blct.china.interfaces.user.vo.UserVo;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserVo> queryAll() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andValidEqualTo(1);
        List<User> users = userMapper.selectByExample(userExample);
        return ModelUtil.modelToDto(users, UserVo.class);
    }
}
