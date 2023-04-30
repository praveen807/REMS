package com.example.rems.service;

import com.example.rems.domain.AgentDetails;
import com.example.rems.domain.PropertyDetails;
import com.example.rems.entity.*;
import com.example.rems.repository.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class AdditionalInfoService {
    @Resource
    private AdditionInfoRepo additionInfoRepo;

    public Additional_info getInfoByPid(BigInteger pid){
        Optional<Additional_info> infoEntity = additionInfoRepo.findById(pid);
        return infoEntity.orElse(null);
    }
}
