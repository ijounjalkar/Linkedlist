package com.DSLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNodeTest {

	@Test
	public void give3NumbersLinkedShouldReturnLinkedList() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		firstElement.setNext(secondElement);
		secondElement.setNext(thirdElement);
		boolean result = firstElement.getNext().equals(secondElement) &&
				secondElement.getNext().equals(thirdElement);
		assertEquals(true, result);
	}

}
