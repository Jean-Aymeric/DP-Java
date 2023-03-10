package com.jad.compositespecification;

public abstract class UnarySpecification<E> extends CompositeSpecification<E> {

	private final Specification<E> specification;

	public UnarySpecification(Specification<E> specification) {
		super();
		this.specification = specification;
	}

	public Specification<E> getSpecification() {
		return specification;
	}
}