package com.mjy.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.mjy.dataSource.DataSourceContextHolder;


public class TaskService{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void search(){
		System.out.println("数据源1:");
		DataSourceContextHolder.setDbType("db1");  
		List<Map<String,String>> re = sqlSessionTemplate.selectList("com.mjy.mapper.TestMapper.getData");
		for (Map<String, String> map : re) {
			for(String key:map.keySet()){
				System.out.println(map.get(key));
			}
		}
		System.out.println("数据源2:");
		DataSourceContextHolder.setDbType("db2");
		List<Map<String,String>> re2 = sqlSessionTemplate.selectList("com.mjy.mapper.MyblogMapper.getMyblog");
		for (Map<String, String> map : re2) {
			for(String key:map.keySet()){
				System.out.println(String.valueOf(map.get(key)));
			}
		}
	}
}