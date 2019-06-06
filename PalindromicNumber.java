class PalindromicNumber{
    public static void main(String[] args) {

        
        
        int hundredThousandNthSpecify = 1;
        int tenThousandNthSpecify = 1;

        int number = 0;
        int maxCount = 0;
        int minCount = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int x = 0;
        int y = 0;
        int z = 0;


        for(int i = 999; i > 100;i -- ){
            for(int j = 999; j > 100; j --){
                number = i * j;
                if(number > 99999){
                    a = number / 100000;
                    b = (number / 10000) % 10;
                    c = (number / 1000) % 100;
                    z = (number % 1000) / 100;
                    y = (number % 100) / 10;
                    x = number % 10;
                    if(a == x && b == y && c == z){
                        maxCount++;
                        if (maxCount == hundredThousandNthSpecify) {
                            System.out.println();
                            System.out.println("6桁の回文数で" + hundredThousandNthSpecify + "番目に大きい数は" + number + "です");

                        }
                    }
                }
                else{
                    a = number / 10000;
                    b = (number / 1000) % 10;
                    y = (number % 100) / 10;
                    x = number % 10;
                    if(a == x && b == y){
                        minCount++;
                        if (minCount == tenThousandNthSpecify) {
                            System.out.println("5桁の回文数で" + tenThousandNthSpecify + "番目に大きい数は" + number + "です");
                            System.out.println();
                        }
                    }
                }

            }
        }

        System.out.println();
        System.out.println("6桁の回文数の数は" +  maxCount + "です");
        System.out.println("5桁の回文数の数は" + minCount + "です");
        System.out.println();


    }

}