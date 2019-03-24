package lists;

class MyLinkedList<S> implements MyList {

    private static int counter;
    private Node head;

    @Override
    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;
        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            while (current.getPrevious() != null) {
                current = current.getPrevious();
            }
            current.setNext(temp);
            current.setPrevious(temp);
        }
        counter++;
    }


    public void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        if (current != null) {
            for (int i = 0; i < index && current.getNext() != null; i++) {
                current = current.getNext();
            }
            for (int i = 0; i < index && current.getPrevious() != null; i++) {
                current = current.getPrevious();
            }
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        temp.setPrevious(current.getPrevious());
        current.setPrevious(temp);

        counter++;
    }

    @Override
    public Object get(int index) {
        if (index < 0)
            return null;
        Node current = null;
        if (head != null) {
            current = head.getNext();
            current = head.getPrevious();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                if (current.getPrevious() == null) {
                    return null;
                }
                current = current.getNext();

            }
            return current.getData();
        }
        return current;

    }

    @Override
    public Object remove(int index) {
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return false;
                } else if (current.getPrevious() == null) {
                    return false;
                }

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            current.setPrevious(current.getPrevious().getPrevious());

            counter--;
            return true;

        }
        return false;
    }

    @Override
    public boolean clear() {
        Node current = head;
        if (head != null) {
            for (int i = 0; i < counter; i++) {
                if (current.getNext() == null) {
                    return false;
                }
                if (current.getPrevious() == null) {
                    return false;
                }
                current.setNext(current.getNext().getNext());
                current.setPrevious(current.getPrevious().getPrevious());
            }
            return true;
        }
        return false;

    }

    @Override
    public int size() {
        return counter;
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node current = head.getNext();
            while (current != null) {
                output += "[" + current.getData().toString() + "]";
                current = current.getNext();
            }

        }
        return output;
    }

    private class Node {
        Node next;
        Node previous;
        Object data;

        public Node(Object dataValue) {
            next = null;
            data = dataValue;
            previous = null;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}


