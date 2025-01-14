package com.rick.mappers;

import com.rick.base.MyMapper;
import com.rick.entities.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface StudentMapper extends MyMapper<Student> {
}
