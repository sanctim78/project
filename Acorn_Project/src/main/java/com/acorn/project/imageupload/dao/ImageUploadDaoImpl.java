package com.acorn.project.imageupload.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.project.imageupload.dto.ImageUploadDto;

@Repository
public class ImageUploadDaoImpl implements ImageUploadDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<ImageUploadDto> getList(ImageUploadDto dto) {
		
		return session.selectList("imageupload.getList", dto);
	}

	@Override
	public ImageUploadDto getData(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("imageupload.getData", num);
	}

	@Override
	public void insert(ImageUploadDto dto) {
		session.insert("imageupload.insert", dto);	
	}
	
	@Override
	public void insertImage(ImageUploadDto dto) {
		session.insert("imageupload.insert2", dto);	
	}

	@Override
	public void insertTag(ImageUploadDto dto) {
		session.insert("imageupload.insert3", dto);
	}

}
