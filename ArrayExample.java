public class ArrayExample {
    
        public static void main(String[] ar){
            //Method-1
           /* int[] myArr=new int[5];
            System.out.println(myArr);
            for(int i=0;i<myArr.length;i++){
                System.out.println("value at index"+i+"="+myArr[i]);
            }
            myArr[0] = 10;
            myArr[1] = 20;
            myArr[2] = 30;
            myArr[3] = 40;
            myArr[4] = 50;
            System.out.print("Array=");
            for(int i=0;i<myArr.length;i++){
                System.out.print(myArr[i]+" ");
            }*/
            //Method-2 Array literals
            int[] myArr1={10,20,30,40,50};
            for(int i=0;i<myArr1.length;i++){
                System.out.print(myArr1[i]+" ");
            }
            
        }
    }
    

