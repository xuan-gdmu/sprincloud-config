package com.lwx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lwxstart
 * @create 2021-01-05 22:06
 * 给前端工程师的
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
