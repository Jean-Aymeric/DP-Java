package com.jad.treenode;

import java.util.LinkedList;

public class NaryTreeNode<E> {
    private E value;
    private final LinkedList<NaryTreeNode<E>> children;

    public NaryTreeNode(final E value) {
        this.value = value;
        this.children = new LinkedList<>();
    }

    public NaryTreeNode() {
        this(null);
    }

    public E getValue() {
        return this.value;
    }

    public void setValue(final E value) {
        this.value = value;
    }

    public NaryTreeNode<E> getChild(final int index) {
        return this.children.get(index);
    }

    public LinkedList<NaryTreeNode<E>> getChildren() {
        return this.children;
    }

    public void addChild(final NaryTreeNode<E> child) {
        this.children.add(child);
    }

    public void removeChild(final NaryTreeNode<E> child) {
        this.children.remove(child);
    }

    public void removeChild(final int index) {
        this.children.remove(index);
    }

    public int getChildrenCount() {
        return this.children.size();
    }
}
