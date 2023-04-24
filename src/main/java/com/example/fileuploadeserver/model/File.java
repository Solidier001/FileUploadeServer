package com.example.fileuploadeserver.model;

import com.example.fileuploadeserver.constant.Modify;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private String name;
    private String path;
    private Modify modify;
    private Timestamp timestamp;
    private String md5;
}
