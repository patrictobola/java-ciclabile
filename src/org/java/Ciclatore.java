package org.java;

public class Ciclatore {

	private int[] list;
	private int currentIndex;
	private int size;

	public Ciclatore() {
		this.list = new int[0];
		this.size = 0;
		this.currentIndex = 0;
	}

	public Ciclatore(int[] list) {

		this.list = list;
		this.currentIndex = 0;
	}

	public int nextNumber() {
		int number = list[currentIndex];
		currentIndex++;
		return number;
	}

	public Boolean hasNextNumber() {
		return currentIndex < list.length;
	}

	public void addElemento(int newElemento) {
		int[] newArray = new int[size + 1];
		System.arraycopy(list, 0, newArray, 0, size);
		newArray[size] = newElemento;
		list = newArray;
		size++;
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
