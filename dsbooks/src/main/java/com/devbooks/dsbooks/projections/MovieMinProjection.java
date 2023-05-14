package com.devbooks.dsbooks.projections;

public interface MovieMinProjection {
    Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
