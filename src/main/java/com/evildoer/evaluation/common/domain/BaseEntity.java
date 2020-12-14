package com.evildoer.evaluation.common.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id", hidden = true)
    private Long id;
    @ApiModelProperty(value = "更新时间", hidden = true)
    private LocalDateTime updateTime;
    @ApiModelProperty(value = "创建时间", hidden = true)
    private LocalDateTime createTime;
}
