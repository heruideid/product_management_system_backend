package com.nostalgia.layui_project_backend.vo;

import com.nostalgia.layui_project_backend.enums.ResultEnum;
import lombok.Data;

import java.util.List;

@Data
public class ResultVO {
    Integer code;
    String msg;
    Integer count;
    Object data;

    public ResultVO(ResultEnum resultEnum,Integer count,List data){
        code=resultEnum.getCode();
        msg=resultEnum.getMsg();
        this.data=data;
        this.count=count;
    }
}
