package com.baidu.bjf.remoting.protobuf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JdkSerializer{

	public static byte[] serialize(Object obj) throws Exception {
		try {
			ByteArrayOutputStream bis = new ByteArrayOutputStream();
			ObjectOutputStream stream = new ObjectOutputStream(bis);
			stream.writeObject(obj);
			stream.close();
			return bis.toByteArray();
		} catch (Exception e) {
			throw e;
		}
	}

	public static Object deserialize(byte[] bytes) throws Exception {
		try {
			//使用zip解压缩
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream stream = new ObjectInputStream(bis);
			return stream.readObject();
		} catch (Exception e) {
			throw e;
		}
	}

}
