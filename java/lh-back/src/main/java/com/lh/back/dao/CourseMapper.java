package com.lh.back.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lh.back.entity.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> listCourse(@Param("record") Course record,@Param("courseIds") List<Long> courseIds);
    
    int deleteCourseByBatch(@Param("courseIds") List<Long> courseIds); 
}