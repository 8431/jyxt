package com.jyxt.index.controller;

import com.jyxt.utils.ResultVo;

/**
 * Created by Administrator on 2017/7/12.
 */

public abstract class BaseController {
    public abstract ResultVo getResultVo(String jsonData);
    public  void initJsonData(String jsonData){

    };
    public void excute(String jsonData){
        initJsonData("");
        getResultVo("");
    };
}
