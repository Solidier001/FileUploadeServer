package com.example.fileuploadeserver.dao;

import com.example.fileuploadeserver.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity,Integer> , JpaSpecificationExecutor<FileEntity> {
}
