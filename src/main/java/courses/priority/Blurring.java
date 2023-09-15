package courses.priority;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Blurring {
    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType());

        WritableRaster inputRaster = inputImage.getRaster();
        WritableRaster outputRaster = outputImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        double[][] convolutionMatrix = getBlurMatrix(3);
        double[] rgb = new double[COLORS_COUNT_IN_RGB];

        int[] inputPixel = new int[COLORS_COUNT_IN_RGB];
        int[] outputPixel = new int[COLORS_COUNT_IN_RGB];

        int indent = convolutionMatrix.length / 2;
        int width = inputRaster.getWidth();
        int height = inputRaster.getHeight();
        int yUpperLimit = height - indent;
        int xUpperLimit = width - indent;

        for (int y = indent; y < yUpperLimit; ++y) {
            for (int x = indent; x < xUpperLimit; ++x) {
                for (int i = 0; i < convolutionMatrix.length; i++) {
                    for (int j = 0; j < convolutionMatrix.length; j++) {
                        inputRaster.getPixel(x + j - indent, y + i - indent, inputPixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            rgb[k] += convolutionMatrix[i][j] * inputPixel[k];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    if (rgb[i] < 0) {
                        rgb[i] = 0;
                        continue;
                    } else if (rgb[i] > 255) {
                        rgb[i] = 255;
                        continue;
                    }

                    outputPixel[i] = (int) Math.round(rgb[i]);
                }

                outputRaster.setPixel(x, y, outputPixel);
                Arrays.fill(rgb, 0);
            }
        }

        ImageIO.write(outputImage, "png", new File("out.png"));
    }

    private static double[][] getBlurMatrix(int matrixRank) {
        double coefficient = 1.0 / Math.pow(matrixRank, 2);

        double[][] blurMatrix = new double[matrixRank][matrixRank];

        for (int i = 0; i < matrixRank; i++) {
            for (int j = 0; j < matrixRank; j++) {
                blurMatrix[i][j] = coefficient;
            }
        }

        return blurMatrix;
    }
}