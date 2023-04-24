package com.example.fileuploadeserver;

import com.example.fileuploadeserver.constant.MissionState;
import com.example.fileuploadeserver.constant.Modify;
import com.example.fileuploadeserver.dao.FileRepository;
import com.example.fileuploadeserver.entity.FileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@SpringBootTest
class FileUploadeServerApplicationTests {

    @Autowired
    FileRepository fileRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    void contextLoads() throws JsonProcessingException {
        FileEntity file=new FileEntity();
        file.setUserName("asdf");
        Example<FileEntity> fileEntityExample=Example.of(file);
        file=fileRepository.findOne(fileEntityExample).get();
//        System.out.println(file.getState().name());
//        file.setCompleteTimestamp(new Timestamp(new Date().getTime()));
        file.setState(MissionState.Receive);
        fileRepository.save(file);
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(file);
        System.out.println(string);
    }

}
