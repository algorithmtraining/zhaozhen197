public class VerifyPostorder {

    public boolean verifyPostorder(int[] postorder) {

        return verifyHelper(postorder, 0, postorder.length-1);
    }

    public boolean verifyHelper(int[] postorder, int left, int right) {
        if(left>=right){
            return true;
        }
        int p = left;
        while (postorder[p] < postorder[right]) {
            p++;
        }
        int m = p;
        while(postorder[p]>postorder[right]){
            p++;
        }

        return p==right && verifyHelper(postorder, left, m-1) && verifyHelper(postorder, m, right-1);
    }
}