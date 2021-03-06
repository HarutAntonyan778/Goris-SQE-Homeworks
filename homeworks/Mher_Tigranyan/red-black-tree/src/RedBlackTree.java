public class RedBlackTree<K,V> {
    Node<K,V> root;
    int size;
    class Node<K,V> {
        boolean isleftChiled;
        K key;
        V value;
        Node<K,V> left, right, parent;
        boolean isleft, black;
        boolean isleftChiled;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
            left = right = parent = null;
            isleft = false;
            black = false;
            isleftChiled = false;
        }
    }

    public void add(K key, V value){
        Node<K,V> node = new Node<K,V>(key, value);
        if (root == null){
            root = node;
            root.black = true;
            size++;
            return;
        }
        add(root, node);
        size ++;
    }

    private void add(Node<K,V> parent, Node<K,V> newNode){
        if (((Comparable<K>) newNode.key).compareTo(parent.key) > 0){
            if (parent.right == null){
                parent.right = newNode;
                newNode.parent = parent;
                newNode.isleft = false;

                return;
            }
            add(parent.right, newNode);
            return;
        }
        if (parent.left == null){
            parent.left = newNode;
            newNode.parent = parent;
            newNode.isleft = true;

            return;
        }
        add(parent.left, newNode);
        checkColor(newNode);
        return;
    }

    public void checkColor(Node<K,V> node){
        if (node == root){
            return;
        }
        if (!node.black && !node.parent.black){
            corectTree(node);
        }
        checkColor(node.parent);
    }

    public void corectTree(Node<K,V> node){
        if (node.parent.isleftChiled){
            //aunt is node.parent.parent.right
            if (node.parent.parent.right == null || node.parent.parent.right.black){
                rotate(node);
                return;
            }
            if (node.parent.parent.right != null){
                node.parent.parent.right.black = true;
                node.parent.parent.black = false;
                node.parent.black = true;
                return;
            }
        }
        // aunt is node.parent.parent.left
        if (node.parent.parent.left == null || node.parent.parent.left.black){
            rotate(node);
            return;
        }
        if (node.parent.parent.left != null){
            node.parent.parent.left.black = true;
            node.parent.parent.black = false;
            node.parent.black = true;
            return;
        }

    }
    
    

    public void rotate(Node<K,V> node){
        if (node.isleftChiled){
            if (node.parent.isleftChiled){
                rightRotate(node.parent.parent);
                node.black = false;
                node.parent.black = true;
                if (node.parent.right != null){
                    node.parent.right.black = false;
                }
                return;
            }
            rightleftRotate(node.parent.parent);
            node.black = true;
            node.right.black = false;
            node.left.black = false;
            return;
        }

        if (!node.isleftChiled){
            if (!node.parent.isleftChiled){
                leftRotate(node.parent.parent);
                node.black = false;
                node.parent.black = true;
                if (node.parent.left != null){
                    node.parent.left.black = false;
                }
                return;
            }
            leftRightRotate(node.parent.parent);
            node.black = true;
            node.right.black = false;
            node.left.black = false;
            return;
        }
    }

    public void leftRotate(Node<K,V> node){
        Node<K,V> temp = node.right;
        node.right = temp.left;
        if (node.right != null){
            node.right.parent = node;
            node.right.isleftChiled = false;
        }
        if (node.parent == null){
            // we add the root node
            root = temp;
            temp.parent = null;
        } else {
            temp.parent = node.parent;
            if (node.isleftChiled){
                temp.isleftChiled = true;
                temp.parent.left = temp;
            }else {
                temp.isleftChiled = false;
                temp.parent.right = temp;
            }
        }
        temp.left = node;
        node.isleftChiled = true;
<<<<<<< HEAD
=======
        node.parent = temp;
    }
    public void rightRotate(Node<K,V> node){
        Node<K,V> temp = node.left;
        node.left = temp.right;
        if (node.left != null){
            node.left.parent = node;
            node.left.isleftChiled = false;
        }
        if (node.parent == null){
            // we add the root node
            root = temp;
            temp.parent = null;
        } else {
            temp.parent = node.parent;
            if (node.isleftChiled){
                temp.isleftChiled = true;
                temp.parent.right = temp;
            }else {
                temp.isleftChiled = false;
                temp.parent.left = temp;
            }
        }
        temp.right = node;
        node.isleftChiled = true;
>>>>>>> 0c441921524e8c38455fa92386814269c7be6ab8
        node.parent = temp;
    }

    public void rightRotate(Node<K,V> node){
        Node<K,V> temp = node.left;
        node.left = temp.right;
        if (node.left != null){
            node.left.parent = node;
            node.left.isleftChiled = false;
        }
        if (node.parent == null){
            // we add the root node
            root = temp;
            temp.parent = null;
        } else {
            temp.parent = node.parent;
            if (!node.isleftChiled){
                temp.isleftChiled = false;
                temp.parent.right = temp;
            }else {
                temp.isleftChiled = true;
                temp.parent.left = temp;
            }
        }
        temp.right = node;
        node.isleftChiled = false;
        node.parent = temp;
    }

    public void leftRightRotate(Node<K,V> node){
        leftRotate(node.left);
        rightRotate(node);
    }

    public void rightLeftRotate(Node<K,V> node){
        rightRotate(node.right);
        leftRotate(node);
    }

    public int height(){
        if (root == null){
            return 0;
        }
        return height(root) - 1;
    }
    public int height(Node<K,V> node){
        if (node == null){
            return 0;
        }
        int leftheight = height(node.left) + 1;
        int rightheight = height(node.right) + 1;
        if (leftheight > rightheight){
            return leftheight;
        }
        return rightheight;
    }
}
