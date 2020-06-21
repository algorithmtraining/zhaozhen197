class IsNumber {
    public boolean isNumber(String s) {
        s=s.trim();
        int length = s.length();
        int plus = 0;
        int reduce = 0;
        int e = 0;
        int num = 0;
        int dot = 0;
        if(length==0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }
            if (s.charAt(i) == 'e') {
                e++;
            }
            if (s.charAt(i) == '-') {
                reduce++;
            }
            if (s.charAt(i) == '+') {
                plus++;
            }
            if(s.charAt(i)=='.'){
                dot++;
            }
        }
        if (plus > 1 || reduce > 1 || e > 1 || dot>1 || num + plus + reduce + e +dot < s.length()) {
            return false;
        }
      
        if ((plus == 1 && reduce ==1)||(plus == 1 && reduce ==0 && s.charAt(0) != '+') || (reduce == 1&&plus==0 && s.charAt(0) != '-')) {
            return false;
        }
        int elocation = s.indexOf('e');
        if((e==1 && elocation == length-1) || (e==1 && elocation == 0) ){
            return false;
        }
       int dotLocation = s.indexOf('.');
        if((dot == 1 && dotLocation==0) || (dot==1&&dotLocation == length-1) ){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsNumber isNumber = new IsNumber();
        boolean flag = isNumber.isNumber(" ");
        System.out.println(flag);
    }
}
