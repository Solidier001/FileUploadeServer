package com.example.fileuploadeserver.exception;

public class IllegalUnitException extends Exception{

    public IllegalUnitException() {
        super("The unit represented by the string does not exist." +
                " The string should be \"1B\",\"1KB\",\"1MB\",or \"1GB\""
        );
    }
}
