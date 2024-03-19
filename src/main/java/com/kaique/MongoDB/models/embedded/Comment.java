package com.kaique.MongoDB.models.embedded;

import java.time.Instant;

public class Comment {


	private String text;
	private Instant moment;
	
	public Comment() {
	}

	public Comment(String text, Instant moment) {
		this.text = text;
		this.moment = moment;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
}