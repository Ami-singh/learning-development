package com.amish.general;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;import java.io.OutputStream;
import java.sql.Timestamp;

public class ByteOutputStreamExample {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(stream);
        Timestamp line = new java.sql.Timestamp(System.currentTimeMillis());
        
        //stream.write(line.getTime());
       System.err.println(line.getTime());
        System.out.println();

	}

}
