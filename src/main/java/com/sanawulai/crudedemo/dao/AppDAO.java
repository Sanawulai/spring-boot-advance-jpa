package com.sanawulai.crudedemo.dao;

import com.sanawulai.crudedemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteIstructorById(int theId);


}
