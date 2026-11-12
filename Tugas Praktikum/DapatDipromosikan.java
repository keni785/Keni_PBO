public interface DapatDipromosikan {
    // Method abstrak
    void promosikan();

    // Default Method
    default void infoPromosi() {
        System.out.println(">>> Aset ini berstatus: DAPAT DIPROMOSIKAN.\n");
    }
}