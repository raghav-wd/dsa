class Solution {
    public int countPrimes(int n) {
        boolean isPrime[] = seiveOfEratosthenes(n-1);
        int counter = 0;
        for(boolean item : isPrime) if(item) counter++;
        return counter;
    }
    
    static boolean[] seiveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; isPrime[1] = false;
        
        for(int i = 2; i * i <= n; i++) {
            
            for(int j = i * 2; j<=n; j+= i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
