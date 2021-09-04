public static void main(String args[]) {
        int num = 2048, i = 32;
        byte binary[] = new byte[i];
        while (num > 0) {
            binary[--i] = (byte) (num % 2);
            num /= 2;
        }
        
        for(byte b : binary)
            System.out.print(b);
    }
