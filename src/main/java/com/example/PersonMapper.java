package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by qwj on 2017/10/12.
 */

//@Mapper就是我们要与mybatis融合关键的一步，只要一个注解就搞定了。
@Mapper
public interface PersonMapper {
    @Select("select * from Person where name = #{name}")
    Person findPersonByName(@Param("name") String name) ;
}
