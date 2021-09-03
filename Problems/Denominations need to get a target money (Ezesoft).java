
class RightVibe {

    static int[] deno = { 1, 5, 10, 25, 100, 500 }; // Denomination notes
    static int target = 468; // target money

    static void calc() {
        int n = deno.length;
        int p = n - 1;

        while(target>=0 && p >=0){
            if(deno[p] > target){
                p--;
            } else {
                target = target - deno[p];
                System.out.println(deno[p]);
            }
        }
    }
    public static void main(String args[]) {
        System.out.println("=========================================================\n");
		
        calc();

        System.out.println();
    }
}



