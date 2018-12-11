package com.acorn.project.imageupload.dto;

public class ImageUploadDto {
	private int num_board;  // 게시물 번호
	private String id_writer; // 작성자 아이디
	private String tag; // 해쉬태그
	private String orgfilename; // 저장된 파일명
	private String filesize; // 파일 사이즈
	private String caption; // 글 내용
	private String regdate; // 등록 날짜	
	
	public ImageUploadDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImageUploadDto(int num_board, String id_writer, String tag, String orgfilename, String filesize,
			String caption, String regdate) {
		super();
		this.num_board = num_board;
		this.id_writer = id_writer;
		this.tag = tag;
		this.orgfilename = orgfilename;
		this.filesize = filesize;
		this.caption = caption;
		this.regdate = regdate;
	}

	public int getNum_board() {
		return num_board;
	}

	public void setNum_board(int num_board) {
		this.num_board = num_board;
	}

	public String getId_writer() {
		return id_writer;
	}

	public void setId_writer(String id_writer) {
		this.id_writer = id_writer;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getOrgfilename() {
		return orgfilename;
	}

	public void setOrgfilename(String orgfilename) {
		this.orgfilename = orgfilename;
	}

	public String getFilesize() {
		return filesize;
	}

	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	

	
	
	
	
	
	
}
