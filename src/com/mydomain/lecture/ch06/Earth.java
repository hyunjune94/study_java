package com.mydomain.lecture.ch06;

public class Earth {
	
	static final double EARTH_RADIUS = 3.1;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI + EARTH_RADIUS * EARTH_RADIUS;
	}

}