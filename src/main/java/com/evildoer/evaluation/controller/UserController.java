package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.UserQuery;
import com.evildoer.evaluation.model.vo.UserVo;
import com.evildoer.evaluation.service.IUserService;
import com.sun.istack.internal.NotNull;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * @Author 安羽兮
     * @Description 返回用户列表
     * @Date 9:58 2020/7/15
     * @Param [page, limit]
     * @Return com.explore.common.ServerResponse
     **/
    @GetMapping("/list")
    public ServerResponse list(UserQuery query) {
        // todo: pagebyquery
        return ServerResponse.createBySuccess(null);
//        return ServerResponse.createBySuccess(userService.pageByQuery(query));
    }

    /**
     * @Author 安羽兮
     * @Description 添加用户
     * @Date 10:04 2020/7/15
     * @Param [userId]
     * @Return com.explore.common.ServerResponse
     **/
    @PostMapping("/add")
    public ServerResponse add(@RequestBody User user) {
        return this.userService.register(user);
    }

    /**
     * @Author 安羽兮
     * @Description 通过id查找
     * @Date 13:42 2020/7/16
     * @Param [id]
     * @Return com.explore.common.ServerResponse
     **/
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        if (null != user) {
            user.setPassword("");
            return ServerResponse.createBySuccess(user);
        } else {
            return ServerResponse.createByError();
        }
    }

    @DeleteMapping("/delete/{user_id:\\d+}")
    public ServerResponse delete(@PathVariable("user_id") Long userId) {
        Boolean result = userService.removeById(userId);
        if (result) {
            return ServerResponse.createBySuccess("删除成功");
        } else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }

    /**
     * @Author 安羽兮
     * @Description //TODO
     * @Date 10:05 2020/7/15
     * @Param [user]
     * @Return com.explore.common.ServerResponse
     **/
    @PutMapping("/update")
    public ServerResponse update(@NotNull @RequestBody UserVo userVo) {
        return userService.updateByUserVo(userVo);
    }
}
