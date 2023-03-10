package com.jad.compositespecification;

public class OrSpecification<E> extends BinarySpecification<E> {

	public OrSpecification(Specification<E> left, Specification<E> right) {
		super(left, right);
	}

	@Override
	public boolean isSatisfiedBy(final E e) {
		return getLeft().isSatisfiedBy(e) || getRight().isSatisfiedBy(e);
	}
}