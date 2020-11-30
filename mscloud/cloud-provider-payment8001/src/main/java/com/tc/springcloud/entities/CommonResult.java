package com.tc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author v_ichaotang
 * @Date 2020/11/30 15:44
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not_found
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
