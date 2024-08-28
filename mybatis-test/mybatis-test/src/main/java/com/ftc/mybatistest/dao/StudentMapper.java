package com.ftc.mybatistest.dao;

import com.ftc.mybatistest.entity.StudentEntity;
import com.ftc.mybatistest.util.mybatisplus.CustomMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学生表 Mapper 接口
 * </p>
 *
 * @author 冯铁城 [17615007230@163.com]
 * @since 2024-08-28
 */
@Mapper
public interface StudentMapper extends CustomMapper<StudentEntity> {

}
