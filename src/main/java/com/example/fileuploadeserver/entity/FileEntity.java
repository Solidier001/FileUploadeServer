package com.example.fileuploadeserver.entity;

import com.example.fileuploadeserver.constant.MissionState;
import com.example.fileuploadeserver.constant.Modify;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "file")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class FileEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @Enumerated
    private MissionState state;
    @Column
    private String name;
    @Column(name = "user_name")
    private String userName;
    @Column
    private String path;
    @Column
    @Enumerated
    private Modify modify;
    @Column(name = "start_timestamp")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private Timestamp startTimestamp;
    @Column(name = "complete_timestamp")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp completeTimestamp;
}
