class ProductOfNumbers {
    private List<Integer> prefixProduct;
    private int product;
    public ProductOfNumbers() {
       prefixProduct = new ArrayList<>();
       prefixProduct.add(1);
       product  = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            prefixProduct.clear();
            prefixProduct.add(1);
            product  = 1;
        }
        else{
            product = product * num;
            prefixProduct.add(product);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProduct.size();
       if(k>=n) return 0;
       return prefixProduct.get(n-1)/prefixProduct.get(n-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */