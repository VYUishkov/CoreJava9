package chapter6.StaticInnerClassTest;

/**
 * Created by VICTOR on 06.06.2017.
 */
public class ArrayAlg
{
    public static class Pair
    {
        private double min;
        private double max;

        public Pair(double min, double max)
        {
            this.min = min;
            this.max = max;
        }

        public double getMin()
        {
            return min;
        }

        public double getMax()
        {
            return max;
        }
    }

    public static Pair minmax(double[] values)
    {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double v : values)
        {
            if (min > v) min = v;
            if (max < v) max = v;
        }

        return new Pair(min, max);
    }
}
