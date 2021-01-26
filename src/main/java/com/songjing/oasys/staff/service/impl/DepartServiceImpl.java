package com.songjing.oasys.staff.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songjing.oasys.staff.entity.Depart;
import com.songjing.oasys.staff.mapper.DepartMapper;
import com.songjing.oasys.staff.service.DepartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 部门表(Depart)表服务实现类
 *
 * @author songjing
 * @since 2021-01-26 16:06:47
 */
@Service
@Slf4j
public class DepartServiceImpl extends ServiceImpl<DepartMapper, Depart> implements DepartService {

}