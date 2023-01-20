package com.example.springbootstarterpack.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestServiceMapper {
    @Select("SELECT 1")
    public String select1();
    public String getTimestamp();
}
