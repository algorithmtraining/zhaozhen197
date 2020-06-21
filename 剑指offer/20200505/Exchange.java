public class Exchange {
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };

    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }

    public static void main(String args[]){
        Exchange ex = new Exchange();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
}
