
public class Sale {

    public static int[] decryptData(int[] price,
                                    int discount,
                                    int offset,
                                    int readLength) {
        if (discount > 0 && discount < 100 && offset >= 0 && readLength > 0
                && readLength+offset<=price.length) {
            int[] newPrices = new int[readLength];
            int j = 0;
            for (int i = offset; i < readLength + offset; i++) {
                if(price[i]>0){
                    newPrices[j] = (int) Math.floor(price[i] - price[i] * discount / 100d);
                    j++;
                } else throw new IllegalArgumentException();
            }
            return newPrices;
        } else {
            throw new IllegalArgumentException();
        }

    }
}
