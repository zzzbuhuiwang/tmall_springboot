package com.jaden.aveh.service;

import com.jaden.aveh.dao.AvehHpDAO;
import com.jaden.aveh.pojo.AvehHp;
import com.jaden.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AvehHpService {
    @Autowired
    AvehHpDAO avehHpDAO;

    public Page4Navigator<AvehHp> list(int start, int size, int navigatePages){

        Sort sort = new Sort(Sort.Direction.ASC,"id");
        Pageable pageable = new PageRequest(start,size,sort);
        Page<AvehHp> pageFromJPA = avehHpDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
}
