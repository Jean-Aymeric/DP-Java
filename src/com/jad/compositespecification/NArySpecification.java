package com.jad.compositespecification;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class NArySpecification<E> extends CompositeSpecification<E> {

	private final ArrayList<Specification<E>> specifications = new ArrayList<>();

	public NArySpecification() {
		super();
	}

	@SafeVarargs
	public NArySpecification(Specification<E>... specifications) {
		super();
		this.specifications.addAll(Arrays.asList(specifications));
	}

	public void add(Specification<E> specification) {
		this.specifications.add(specification);
	}

	public ArrayList<Specification<E>> getSpecifications() {
		return specifications;
	}
}