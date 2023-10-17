public class Hello {

    public static void main(String[] args) {
        int contenanceCamion = 9;
        int nbreCarton = 34;
        int carton = 34;
        while (nbreCarton >= 0) {
            if (nbreCarton < contenanceCamion) {
                System.out.println("Un voyage avec " + (nbreCarton) + " cartons");
            }
            else {
                System.out.println("Un voyage avec " + (contenanceCamion) + " cartons");
            }
            nbreCarton -= contenanceCamion;
        }
    }
}
