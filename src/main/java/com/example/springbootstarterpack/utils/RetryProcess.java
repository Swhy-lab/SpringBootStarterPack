package com.example.springbootstarterpack.utils;

//재시도용
abstract class RetryProcess<T> {
    abstract T __process() throws Exception;

    public T start(int retry) throws Exception{
        T returnData = null;
        int i = 0;
        while(i++ < retry){
            try{
                returnData =  __process();
                i = Integer.MAX_VALUE;
            }catch(Exception e){
                if(i == retry){
                    throw e;
                }

                Thread.sleep(1000);
                System.out.println("재시도("+retry+") : "+i);
            }
        }
        return returnData;
    }
    public T startNoThrowsException(int retry){
        T returnData = null;
        int i = 0;
        while(i++ < retry){
            try{
                returnData =  __process();
                i = Integer.MAX_VALUE;
            }catch(Exception e){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("재시도("+retry+") : "+i);
            }
        }
        return returnData;
    }

}