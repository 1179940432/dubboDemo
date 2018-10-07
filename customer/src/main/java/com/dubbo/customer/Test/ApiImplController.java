package com.dubbo.customer.Test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.core.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiImplController {

    @Reference()
    public ApiService apiService;

    @RequestMapping("/hello")
    public String hgaha(){
        return apiService.X();
    }
}
