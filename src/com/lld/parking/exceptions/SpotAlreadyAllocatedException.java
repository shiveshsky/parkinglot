package com.lld.parking.exceptions;

public class SpotAlreadyAllocatedException extends Exception{
    public SpotAlreadyAllocatedException(String s){
        super(s);
    }
}
