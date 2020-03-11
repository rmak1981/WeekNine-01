package packageone;

public class ClassOne {

    public static void main(String[] args) {

        additionMethod();// method to do add
        ClassOne dm = new ClassOne();
        dm.dvideMethod(10,2);
        //System.out.println(re);
    }

    public static void additionMethod() {
       int a = 10; // value of number in seq
        int b = 20; // value in dozon
        String sejalBhadni = ("SejalBhadani ");
        int result = (a+b);
        System.out.println(sejalBhadni);
        System.out.println(result);
    }

    public int dvideMethod(int x,int y) {

        int result = (x / y);
        System.out.println(result);
        return result;

    }

}




