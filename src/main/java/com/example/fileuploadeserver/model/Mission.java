package com.example.fileuploadeserver.model;

import com.example.fileuploadeserver.constant.MissionState;
import com.example.fileuploadeserver.constant.SizeUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mission {
    private int chunkCount;
    private int chunkSize;
    private SizeUnit unit;
    private MissionState state;
    private String srcPath;
    private String macAddrMd5;
    private File file;
    private Chunk[] chunks;
}
