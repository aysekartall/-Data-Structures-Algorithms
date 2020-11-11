package doublyLinkedList;

public class Node<E>{
				private E element;
				private Node<E> next;
				private Node<E> prev;

				public Node(E e, Node<E> p, Node<E> n) {
					element = e;
					next = n;
					prev=p;
				}

				public E getElement() {
					return element;
				}
				public void setElement(E e)
				{
					element=e;
				}

				public Node<E> getNext() {
					return next;
				}

				public void setNext(Node<E> n) {
					next = n;
				}
				
				public Node<E> getPrev() {
					return prev;
				}

				public void setPrev(Node<E> p) {
					prev = p;
				}
			}

