package assignment;

public class Average {

	    public static void main(String[] args) {
	        int sum = 0;
	        int count = 0;

	        for (String arg : args) {
	            int num = Integer.parseInt(arg);
	            sum += num;
	            count++;
	        }

	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("평균은 " + average);
	        }
	    }
	}

