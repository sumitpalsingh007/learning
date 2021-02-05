public class FindCommonParentOfTwoNodesInTree {

    private boolean aFound;
    private boolean bFound;

    public static void main(String[] args){

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();

        a.value = "a";
        b.value = "b";
        c.value = "c";
        d.value = "d";
        e.value = "e";
        f.value = "f";

        a.left = b;
        a.right =c;
        b.left = d;
        b.right = e;
        e.left =f;

        FindCommonParentOfTwoNodesInTree s = new FindCommonParentOfTwoNodesInTree();
        System.out.println(s.findCommonParent(d,f,a));

    }

    private String findCommonParent(final Node a, final Node b, Node parent){
        if(null == parent) {
            return "Error";
        }
        if (parent.left != null) {
            findCommonParent(a, b, parent.left);
        }
        if (parent.right != null) {
           findCommonParent(a, b, parent.right);
        }
        if (parent.value.equals(a.value)){
            aFound = true;
        }
        if (parent.value.equals(b.value)){
            bFound = true;
        }

        if (aFound && bFound) {
            return parent.value;
        }

        /*if (!aFound){
            return "A not found";
        }
        if (!bFound){
            return "B not found";
        }*/
        return parent.value;
    }

    private static class Node {

        String value;
        Node left;
        Node right;
    }

}
