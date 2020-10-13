package com.DSLinkedList;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode next;

	public INode<K> getNext() {
		return next;
	}
	@Override
	public void setNext(INode next) {
		this.next = (MyNode<K>) next;
	}
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}

	public MyNode(K key) {
		this.key = key;
		this.next =null;
	}

}