package Core_Java_PartI_Fundamentals;

public class usingJDB {
    public static class Test{
        private int x = 4;
        public static int add(int a, int b){
            return a+b;
        }
        public void setX(int newX){
            this.x = newX;
        }
    }
    public static void main(String...args){
        int x = 2, y = 3;
        int z = Test.add(x,y);
        Test t = new Test();
        t.setX(23);
        System.out.printf("%d+%d = %d\n",x,y,z);

    }
}
