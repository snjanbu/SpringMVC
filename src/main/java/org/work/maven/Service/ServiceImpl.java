package org.work.maven.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements AddService{

	@Override
	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
