package com.baidu.bjf.remoting.protobuf;

import java.io.IOException;

public class UserTest {
	
	public static void main(String[] args) {
		
		Codec<User> UserCodec = ProtobufProxy.create(User.class);
		User user = new User();
		user.setId(124354564564L);
		user.setAge(24);
		user.setMoney(54354353.321);
		user.setName("lindezhi");
		user.setPrice(43.1f);
		user.setSex(1);
		user.setValid(false);
		int count = 5000;
		try {
			byte[] encode = null;
			int i=0;
			long start = System.currentTimeMillis();
			while(i<count){
				encode = UserCodec.encode(user);
				i++;
			}
			long end = System.currentTimeMillis();
			System.out.println("protobuf "+count+" encode len:"+encode.length+" cost:"+(end-start));
			User duser = null;
			start = System.currentTimeMillis();
			i = 0;
			while(i<count){
				duser = UserCodec.decode(encode);
				i++;
			}
			end = System.currentTimeMillis();
			System.out.println("protobuf "+count+" decode cost:"+(end-start));
			System.out.println(duser);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			int i=0;
			byte[] bs = null;
			long start = System.currentTimeMillis();
			while(i<count){
				bs = JdkSerializer.serialize(user);
				i++;
			}
			long end = System.currentTimeMillis();
			System.out.println("jdk "+count+" encode len:"+bs.length+" cost:"+(end-start));
			
			i = 0;
			start = System.currentTimeMillis();
			User duser = null;
			while(i<count){
				duser = (User)JdkSerializer.deserialize(bs);
				i++;
			}
			end = System.currentTimeMillis();
			System.out.println("jdk "+count+" decode cost:"+(end-start));
			System.out.println(duser);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
