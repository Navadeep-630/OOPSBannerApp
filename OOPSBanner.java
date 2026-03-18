class OOPSBanner {

    // Inner class
    class Inner {
        void printOops() {
            System.out.println(" ***    ***    ****    ****");
            System.out.println("*   *  *   *   *   *  *    ");
            System.out.println("*   *  *   *   ****    *** ");
            System.out.println("*   *  *   *   *          *");
            System.out.println(" ***    ***    *      **** ");
        }
    }

    public static void main(String[] args) {
        OOPSBanner obj = new OOPSBanner();          // outer class object
        OOPSBanner.Inner inner = obj.new Inner();   // inner class object
        inner.printOops();                          // method call
    }
}