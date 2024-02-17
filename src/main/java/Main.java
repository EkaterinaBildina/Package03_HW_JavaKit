public class Main {
    public static void main(String[] args) {
        System.out.println("----------Task01-----------");
        Calculator calculator = new Calculator();
        double sumCheck = calculator.sum(2, 12.45);
        System.out.println(sumCheck);
        double multiplyCheck = calculator.multiply(1.1, 5);
        System.out.println(multiplyCheck);
        double divideCheck = calculator.divide(50, 3);
        System.out.println(divideCheck);
        double subtractCheck = calculator.subtract(20, 0.8);
        System.out.println(subtractCheck);


        System.out.println("----------Task02-----------");
        CompareArrays compareArrays = new CompareArrays();
        Integer[] array1 = {1,2,5};
        Integer[] array2 = {1,2,5};
        boolean result1 = CompareArrays.compareArrays(array1, array2);
        System.out.println(result1);

        String[] array3 = {"a","b","c"};
        Integer[] array4 = {1,2,5};
        boolean result2 = CompareArrays.compareArrays(array3, array4);
        System.out.println(result2);

        String[] array5 = {"a","b","c"};
        String[] array6 = {"a","b","c"};
        boolean result3 = CompareArrays.compareArrays(array5, array6);
        System.out.println(result3);


        System.out.println("----------Task03-----------");
        Pair<String, Integer> pair1 = new Pair("Ekaterina", 1988);
        System.out.println(pair1);
    }
}
