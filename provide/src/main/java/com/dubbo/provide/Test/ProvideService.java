package com.dubbo.provide.Test;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.core.ApiService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ApiService.class)
@Component
public class ProvideService implements ApiService {
    @Override
    public String X() {
        return "gagaga";
    }
}
