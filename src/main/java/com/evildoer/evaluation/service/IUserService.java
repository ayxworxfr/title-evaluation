package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.ChangePassword;
import com.evildoer.evaluation.model.vo.UserVo;
import com.sun.istack.internal.NotNull;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IUserService extends IService<User> {

    ServerResponse login(String username, String password);

    Long getUserIdByToken();

    Long getUserIdByToken(String token);

    ServerResponse register(User user);

    ServerResponse changePassword(ChangePassword changePassword);

    String flushToken();

    String flushToken(@NotNull String token);

//    Page<UserVo> pageByQuery(UserQuery query);

    void updateUserRole(UserVo userVo);

    ServerResponse updateByUserVo(UserVo userVo);
}
