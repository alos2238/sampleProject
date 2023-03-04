package com.study.sampleProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.sampleProject.dao.SampleDao;
import com.study.sampleProject.vo.SampleVo;

@Service
public class SampleService {
	
	@Autowired
	SampleDao sampleDao;
	
	public List<SampleVo> getSampleData(){
		return sampleDao.getSample();
	}
	
}
