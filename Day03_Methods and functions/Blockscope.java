public class Blockscope {

        public static void main(String[] args) {
            int a = 9;
            int b = 3;
            System.out.println(a);
            {
                //this area is called block scope
                a=10;
            }
            System.out.println(a);//so here value will change
        }
        static void num(){
            int num = 10;
            System.out.println(num);
        }


    }
