package com.jad.compositespecification;

public abstract class CompositeSpecification<E> implements Specification<E> {

	@Override
	public Specification<E> or(final Specification<E> specification) {
		return new OrSpecification<>(this, specification);
	}

	@Override
	public Specification<E> xor(final Specification<E> specification) {
		return new XOrSpecification<>(this, specification);
	}

	@Override
	public Specification<E> and(final Specification<E> specification) {
		return new AndSpecification<>(this, specification);
	}

	@Override
	public Specification<E> not() {
		return new NotSpecification<>(this);
	}

	public abstract boolean isSatisfiedBy(E e);
}