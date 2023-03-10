package com.jad.compositespecification;

public abstract class BinarySpecification<E> extends NArySpecification<E> {

	public BinarySpecification(Specification<E> left, Specification<E> right) {
		super(left, right);
	}

	public Specification<E> getLeft() {
		return getSpecifications().get(0);
	}

	public Specification<E> getRight() {
		return getSpecifications().get(1);
	}
}