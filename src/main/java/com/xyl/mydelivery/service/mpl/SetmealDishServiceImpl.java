package com.xyl.mydelivery.service.mpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyl.mydelivery.entity.SetmealDish;
import com.xyl.mydelivery.mapper.SetmealDishMapper;
import com.xyl.mydelivery.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish>
        implements SetmealDishService {
}
