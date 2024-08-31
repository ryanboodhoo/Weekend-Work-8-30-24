public class Main {

   public static int getLastIndex(String[] names) {
        return names.length - 1;
        }

    public static int getSecondToLastIndex (String[]names){
        return names.length - 2;

    }

    public static String getFirstElement (String[]names){
        return names[0];
    }


    public static String getLastElement(String[] names) {
            return names[names.length - 1];
        }

    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    public static int getSum(int[] ints) {
       int sum = 0;

        for (int i = 0; i < ints.length; i++){
            sum = sum + ints[i];

            // 0 = 0 + ints[0] = 1

            // 1 = 1 + ints[1] = 3

            // 3 = 3 + ints[2] = 6
        }
            return sum;
    }

    public static int getAverage(int[] ints) {
            int sum = 0;

            for (int i = 0; i < ints.length; i++){
                sum = sum + ints[i];
            }
            return sum/ints.length;
        }

    public static String extractAllOddNumbers(int[] numbers) {
       String i = "";
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 == 1) {
                i += numbers[x];
            }
        }
        return i;
    }

    public static String extractAllEvenNumbers(int[] numbers) {
        String i = "";
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 == 0) {
                i += numbers[x];
            }
        }
        return i;
    }

    public static boolean contains(String[] names, String element) {
        boolean contains = false;
        for (String i : names) {
            if (i.contains(element)) {
                contains = i.contains(element);
            }
        }
        return contains;
    }


    public static void main (String[]args){
            System.out.println(getLastIndex(new String[]{"ryan", "shawn", "bob"}));

            System.out.println(getSecondToLastIndex(new String[]{"ryan", "shawn", "bob"}));

            System.out.println(getFirstElement(new String[]{"ryan", "shawn", "bob"}));

            System.out.println(getLastElement(new String[]{"ryan", "shawn", "bob"}));

            System.out.println(getSecondToLastElement(new String[]{"ryan", "shawn", "bob"}));

            System.out.println(getSum(new int[]{1 ,2 ,3}));

            System.out.println(getAverage (new int[]{1, 4, 5, 6}));

            System.out.println(extractAllOddNumbers(new int[]{1 , 2 ,3 ,4 ,5, 6, 7, 8, 9, 10}));

            System.out.println(extractAllEvenNumbers(new int[]{1 , 2 ,3 ,4 ,5, 6, 7, 8, 9, 10}));

            System.out.println(contains(new String[]{"shawn", "bob"}, "shawn"));


        }

    }

