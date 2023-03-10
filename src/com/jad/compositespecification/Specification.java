package com.jad.compositespecification;

public interface Specification<E> {

	boolean isSatisfiedBy(E e);

	Specification<E> or(final Specification<E> specification);

	Specification<E> xor(final Specification<E> specification);

	Specification<E> and(final Specification<E> specification);

	Specification<E> not();

}