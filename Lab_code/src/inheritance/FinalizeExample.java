package inheritance;

class FinalizeExample {
    @Override
    protected void finalize() {
        System.out.println("Object is getting destroyed.");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null;
        System.gc();  
    }
}
