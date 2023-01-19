package taskss.easy;

import utils.Node;

import java.util.LinkedList;
import java.util.List;

public class T589 {

    List<Integer> a = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return null;
        }

        do_the_thing(root);


        return a;
    }
    public void do_the_thing(Node root){
        a.add(root.val);
        for (Node n: root.children
        ) {
            do_the_thing(n);

        }
    }
}
