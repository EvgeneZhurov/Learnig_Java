package courses.lesson12;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(1, 3, 3, 1);
        Parallelepiped par = new Parallelepiped(0, 0, 0, 2, 2, 2);

        System.out.println(isSphereAndParallelepipedCrossed(sphere, par));
    }

    public static boolean isSphereAndParallelepipedCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        if (isSphereInside(sphere, parallelepiped)) { // �E���|�y ���u�~���� ���p���p (�r���x�}���w�~��, �r�u���� ���p��) �r�~�������y ���p���p�|�|�u�|�u���y���u�t�p
            return true;
        }

        if (isHeightCrossed(sphere, parallelepiped)) { // �E���|�y �������� ���t�~�p �y�x �r�u�����y�~ �r�~�������y ���p���p
            return true;
        }
        // �E���|�y ���p�� ���u���u���u�{�p�u�� �y�|�y �{�p���p�u������ �q�|�y�w�p�z���u�z �{ �~�u�}�� �����������~�� ���p���p�|�|�u�|�u���y���u�t�p
        return isSideCrossed(sphere, parallelepiped);
    }

    public static boolean isSphereInside(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getHeights().length; i++) {
            if (distanceBetweenPoints(sphere.getCenter(), parallelepiped.getHeights()[i]) > Math.pow(sphere.getRadius(), 2)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isHeightCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getHeights().length; i++) {
            if (distanceBetweenPoints(sphere.getCenter(), parallelepiped.getHeights()[i]) <= Math.pow(sphere.getRadius(), 2)) {

                return true;
            }
        }

        return false;
    }

    public static boolean isSideCrossed(Sphere sphere, Parallelepiped parallelepiped) {
        for (int i = 0; i < parallelepiped.getSides().length; i++) { // �O�����u�t�u�|���u�} ���|�����{�������� �s���p�~�y �y �������{�� ���u���u���u���u�~�y��
            int[][] side = parallelepiped.getSides()[i]; // �P���������� �������q�� ���t���q�~�u�z �x�p���y���� �q���|�p
            int[] crossPoint = {sphere.getCenter()[0], sphere.getCenter()[1], sphere.getCenter()[2]};

            if (side[0][0] == side[2][0]) { // �R�~�p���p�|�p �� ���y���p�| ������ �r���u �������{�y, ���������} �����~���| ������ �t�������p�������~�� �t�y�p�s���~�p�|�y
                crossPoint[0] = side[0][0];
            } else if (side[0][1] == side[2][1]) {
                crossPoint[1] = side[0][1];
            } else if (side[0][2] == side[2][2]) {
                crossPoint[2] = side[0][2];
            } else {
                System.out.println("wtf");
            }

            if (distanceBetweenPoints(sphere.getCenter(), crossPoint) <= Math.pow(sphere.getRadius(), 2)) {
                // �E���|�y ���p�����������~�y�u ���� ���u�~�����p ���p���p �t�� �������{�y ���u���u���u���u�~�y�� �� ���|�����{���������� �s���p�~�y �}�u�~�����u ���p�t�y�����p (���u���u���u�{�p�u��), �|�y�q�� ���p�r�~�� (�{�p���p�u������)
                if (isPointOnSide(crossPoint, side)) { // �I �������{�p ���u���u���u���u�~�y�� �|�u�w�y�� �r�~�������y �s���p�~�y (�r�{�|�����p�� ���u�q���p) �~�p �������z ���|�����{�������y

                    return true; // �S�� ���u���u���u�{�p�u��
                }
            }
        }

        return false;
    }


    public static int distanceBetweenPoints(int[] firstPoint, int[] secondPoint) {
        return (int) (Math.pow(firstPoint[0] - secondPoint[0], 2) + Math.pow(firstPoint[1] - secondPoint[1], 2) + Math.pow(firstPoint[2] - secondPoint[2], 2));
    }

    public static boolean isPointOnSide(int[] crossPoint, int[][] side) {
        //�S�����{�p �����y�~�p�t�|�u�w�y�� �������}�����s���|���~�y�{��
        return (((side[0][0] <= crossPoint[0]) && (crossPoint[0] <= side[2][0])) &&
                ((side[0][1] <= crossPoint[1]) && (crossPoint[1] <= side[2][1])) &&
                ((side[0][2] <= crossPoint[2]) && (crossPoint[2] <= side[2][2])));
    }
}
