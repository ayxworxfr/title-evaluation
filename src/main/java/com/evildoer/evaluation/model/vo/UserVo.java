package com.evildoer.evaluation.model.vo;

import com.evildoer.evaluation.model.entity.User;
import lombok.Data;

@Data
public class UserVo extends User {

    String token;

    String role;
}
