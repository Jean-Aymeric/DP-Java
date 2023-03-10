package com.jad.compositespecification;

public class AndSpecification<E> extends BinarySpecification<E> {

	public AndSpecification(Specification<E> left, Specification<E> right) {
		super(left, right);
	}

	@Override
	public boolean isSatisfiedBy(E e) {
		return getLeft().isSatisfiedBy(e) && getRight().isSatisfiedBy(e);
	}
}