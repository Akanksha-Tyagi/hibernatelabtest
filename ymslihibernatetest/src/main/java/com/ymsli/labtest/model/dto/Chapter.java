package com.ymsli.labtest.model.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chapter_id;
	private String title;
	private Integer chapterNumber;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_isbn")
	private Book book;

	public Chapter() {
	}

	public Chapter(Long chapter_id, String title, Integer chapterNumber) {
		this.chapter_id = chapter_id;
		this.title = title;
		this.chapterNumber = chapterNumber;
	}

	public Chapter(String title, Integer chapterNumber) {
		this.title = title;
		this.chapterNumber = chapterNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chapter [chapter_id=");
		builder.append(chapter_id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", chapterNumber=");
		builder.append(chapterNumber);
		builder.append(", book=");
		builder.append(book);
		builder.append("]");
		return builder.toString();
	}

}
