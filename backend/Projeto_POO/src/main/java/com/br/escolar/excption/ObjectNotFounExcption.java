package com.br.escolar.excption;

public class ObjectNotFounExcption extends RuntimeException{

    public ObjectNotFounExcption() {
        super("Object not found.");
    }
}
