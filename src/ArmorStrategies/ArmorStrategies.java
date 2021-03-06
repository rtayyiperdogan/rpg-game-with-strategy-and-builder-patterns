package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public interface ArmorStrategies {
    String getArmor();
    int getHealthPoints();
    void reduceHealthPoints(int damage);
}
