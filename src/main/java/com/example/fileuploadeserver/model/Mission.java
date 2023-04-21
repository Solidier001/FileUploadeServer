package com.example.fileuploadeserver.model;

import com.example.fileuploadeserver.Constant.SizeUnit;
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
    private File file;
    private Chunk[] chunks;
}
