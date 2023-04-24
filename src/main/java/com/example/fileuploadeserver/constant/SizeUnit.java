package com.example.fileuploadeserver.constant;

import com.example.fileuploadeserver.exception.IllegalUnitException;

public enum SizeUnit {
    Bits(1),KB(1000),MB(1000000),GB(1000000000);
    public final long size;

    SizeUnit(long size) {
        this.size = size;
    }

    @Override
    public String toString() {

        switch (this){
            case Bits:return "1B";
            case KB:return "1KB";
            case MB:return "1MB";
            case GB:return "1GB";
            default:return "No such unit";
        }
    }

    public SizeUnit getUnit(String Unit) throws IllegalUnitException {
        switch (Unit){
            case "1B": return Bits;
            case "1KB": return KB;
            case "1MB": return MB;
            case "1GB": return GB;
            default:
                throw new IllegalUnitException();
        }
    }
}
