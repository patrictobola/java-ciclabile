package org.java;

import java.util.NoSuchElementException;

public class Ciclatore {
	
	private int[] list;
	private int currentIndex;
	
	public Ciclatore(int[] list) {
		
		this.list = list;
		this.currentIndex = 0;
	}
	
	public int nextNumber() {
		int number = list[currentIndex];
		currentIndex = (currentIndex + 1) % list.length;
		return number;
	}
	
	public Boolean hasNextNumber() {
		return currentIndex < list.length - 1;
	}
	
	
	public int[] getList() {
		return list;
	}

	public void setList(int[] list) {
		this.list = list;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
}
