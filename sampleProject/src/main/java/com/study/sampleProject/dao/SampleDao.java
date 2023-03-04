package com.study.sampleProject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.sampleProject.vo.SampleVo;

@Mapper
public interface SampleDao {
	
	public List<SampleVo> getSample();
}
