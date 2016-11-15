import java.util.Scanner;
public class ArrayHelper
{

    public static int[] makeRange(int from, int to)
    {
        int[] makeRange = new int[to-from];
        for (int i=from;i<to;i++)
        {
            makeRange[i-from]=i;
        }
        return makeRange;
    }
    
    public static int[] makeRandom(int n, int small, int big)
    {
        int[] makeRandom = new int[n];
        for (int i=0;i<n;i++)
        {
            makeRandom[i]=(int)(Math.random()*(big-small))+small;
        }
       return makeRandom;
    }
    
    public static int indexOf(int[] haystack, int needle)
    {
        
        for (int i = 0;i<haystack.length;i++)
        {
            if (needle==haystack[i])
            {
                return i;
            }
        }
        return -1;
    }
    
    public static int valueAt(int[] haystack, int index)
    {
        return haystack[index];
    }

    public static int count(int[] haystack, int needle)
    {
        int count = 0;
        for (int i = 0;i<haystack.length;i++)
        {
            if (needle==haystack[i])
            {
                count++;
            }
        }
        return count;
    }

    public static String toString(int[] haystack)
    {
        String toString = new String();
        toString = "[";
        for (int i = 0;i<haystack.length;i++)
        {
            if (i<haystack.length-1)
            {
                toString = toString+haystack[i]+", ";
            }
            else
            {
                toString = toString+haystack[i];
            }
        }
        toString = toString+"]";
        return toString;
    }

    public static int sum(int[] haystack)
    {
        int sum = 0;
        for (int i = 0;i<haystack.length;i++)
        {
            int value = haystack[i];
            sum = sum+value;
        }
        return sum;
    }
    
    public static int getSmallest(int[] haystack)
    {
        int getSmallest = haystack[0];
        for (int i = 1;i<haystack.length;i++)
        {
            if (getSmallest>haystack[i])
            {
                getSmallest = haystack[i];
            }
        }
        return getSmallest;
    }

    public static int getSmallestIndex(int[] haystack)
    {
        int getSmallest = haystack[0];
        for (int i = 1;i<haystack.length;i++)
        {
            if (getSmallest>haystack[i])
            {
                getSmallest = haystack[i];
            }
        }
         for (int i = 0;i<haystack.length;i++)
        {
            if (getSmallest==haystack[i])
            {
                return i;
            }
        }
        return getSmallest;
    }

    public static double mean(int[] haystack)
    {
        double mean = 0;
        for (int i = 0;i<haystack.length;i++)
        {
            mean = mean+haystack[i];
        }
        mean = mean/haystack.length;
        return mean;
    }
    

    public static int mode(int[] haystack)
    {
        int count = 0;
        int[] value = new int[haystack.length];
        int[] v = new int[haystack.length];
        int n = haystack[0];
        int j = 0;
        for (int i = 0;i<haystack.length;i++)
        {
            if (n==haystack[i])
            {
                count++;
                value[j]=count;
            }
            else
            {
                v[j]=n;
                j++;
                count = 1;
                value[j] = count;
                n=haystack[i];
            }
        }
        v[j]=n;
        int x = v[0];
        int getLargest = value[0];
        for (int i = 1;i<=j;i++)
        {
            if (getLargest<value[i])
            {
                getLargest = value[i];
                x = v[i];
            }
        }
        
        return x;
    }
    
    public static double median(int[] haystack)
    {
        double median;
        if (haystack.length%2==0)
        {
            median = (double)(haystack[haystack.length/2]+
                              haystack[(haystack.length/2)-1])/2;
        }
        else
        {
            median = (haystack[(int)(haystack.length/2)]);
        }
        return median;
    }

    public static boolean nonDecreasing(int[] haystack)
    {
        boolean nonDecreasing = true;
        for (int i = 1;i<haystack.length;i++)
        {
            if(haystack[i]>=haystack[i-1])
            {
                nonDecreasing = true;
            }
            else
            {
                nonDecreasing = false;
                return nonDecreasing;
            }
        }
        return nonDecreasing;
    }
               = { -2,   4,  -2,   4,  -7,   3,   4}
     */
    public static int[] calculateDifferences(int[] haystack)
    {
        int [] calculateDifferences = new int[haystack.length-1];
        for (int i = 0;i< haystack.length-1;i++)
        {
            calculateDifferences[i] = haystack[i+1]-haystack[i];
        }
        return calculateDifferences;
    }

    public static int[] add(int[] haystack, int value)
    {
        int[] add = new int[haystack.length+1];
        for (int i = 0;i<haystack.length;i++)
        {
            add[i] = haystack[i];
        }
        add[haystack.length] = value;
        return add;
    }

    public static int[] remove(int[] haystack, int index)
    {
        int[] remove = new int[haystack.length-1];
        int j = 0;
        for (int i = 0;i<haystack.length;i++)
        {
            if (index!=i)
            {
                remove[j]=haystack[i];
                j++;
            }
        }
        return remove;
    }
    
    public static String[] split(String sentence)
    {
        int spaces = 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            String letter = sentence.substring(i,i+1);
            if(letter.equals(" ") == true)
            {
                spaces++;
            }
        }
        String [] split = new String[spaces+1];
        int splitMark = 0;
        int s = 0;
        for (int j = 0; j < sentence.length(); j++)
        {
            String letter = sentence.substring(j,j+1);
            if(letter.equals(" ") == true)
            {
                String tales = sentence.substring(s,j);
                split[splitMark] = tales;
                splitMark++;
                s = j+1;
            }
        }
        split[splitMark] = sentence.substring(s);
        return split;
    }
}


