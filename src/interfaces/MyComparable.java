package interfaces;

public class MyComparable implements Comparable<String> {

    @Override
    public int compareTo(String o) {
      return o.compareTo("Hello");
    }
    public static void main(String[] args){
        MyComparable myComparable = new MyComparable();
        int result = myComparable.compareTo("Radha");
        System.out.println("The Result is "+result);

        //Anonymous class does 2 things: declare the class, and create instance
        Comparable<String> comparable = new Comparable<String>(){
            @Override
            public int compareTo(String o) {
                return o.compareTo("Hello");
            }
        };
        int resultAnon = comparable.compareTo("Radha");
        System.out.println("Result of Anonymous is "+resultAnon);

        //Lambda Expression (used when an interface has only one method)
        //Lambda represents a function
        Comparable<String> comparableLambda =  o -> o.compareTo("Hello"); ;
        int resultLambda = comparableLambda.compareTo("Radha");
        System.out.println("Result of Lambda is " + resultLambda);
    }

}
