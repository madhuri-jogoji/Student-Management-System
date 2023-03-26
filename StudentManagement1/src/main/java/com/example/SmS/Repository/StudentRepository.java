package com.example.SmS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SmS.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
