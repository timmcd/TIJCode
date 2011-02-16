import com.bruceeckel.simpletest.*;
import java.util.*;

public class MathOps {
    static Test monitor = new Test();

    static void printInt(String s, float f) {
	System.out.println(s + " = " + f);
    }

    static void printFloat(String s, float f) {
	System.out.println(s + " = " + f);
    }

    public static void main(String[] args) {
	Random rand = new Random();
	int i, j, k;
	
	j = rand.nextInt(100) + 1;
	k = rand.nextInt(100) + 1;
	
	printInt("j", j); printInt("k", k);

	i = j + k; printInt("j + k", i);
	i = j - k; printInt("j - k", i);
	i = k / j; printInt("k / j", i);
	i = k * j; printInt("k * j", i);
	i = k % j; printInt("k % j", i);
	j %= k; printInt("j %= k", j);

	float u,v,w;
	v = rand.nextFloat();
	w = rand.nextFloat();

	printFloat("v", v); printFloat("w", w);

	u = v + w; printFloat("v + w", u);
	u = v - w; printFloat("v - w", u);
	u = v * w; printFloat("v * w", u);
	u = v / w; printFloat("v / w", u);

	u += v; printFloat("u += v", u);
	u -= v; printFloat("u -= v", u);
	u *= v; printFloat("u *= v", u);
	u /= v; printFloat("u /= v", u);

	monitor.expect(new String[] {
		"%% j = -?\\d+.?\\d+?",
		"%% k = -?\\d+.?\\d+?",
		"%% j \\+ k = -?\\d+.?\\d+?",
		"%% j - k = -?\\d+.?\\d+?",
		"%% k / j = -?\\d+.?\\d+?",
		"%% k \\* j = -?\\d+.?\\d+?",
		"%% k % j = -?\\d+.?\\d+?",
		"%% j %= k = -?\\d+.?\\d+?",
		"%% v = -?\\d+\\.\\d+(E-?\\d)?",
		"%% w = -?\\d+\\.\\d+(E-?\\d)?",
		"%% v \\+ w = -?\\d+\\.\\d+(E-?\\d)??",
		"%% v - w = -?\\d+\\.\\d+(E-?\\d)??",
		"%% v \\* w = -?\\d+\\.\\d+(E-?\\d)??",
		"%% v / w = -?\\d+\\.\\d+(E-?\\d)??",
		"%% u \\+= v = -?\\d+\\.\\d+(E-?\\d)??",
		"%% u -= v = -?\\d+\\.\\d+(E-?\\d)??",
		"%% u \\*= v = -?\\d+\\.\\d+(E-?\\d)??",
		"%% u /= v = -?\\d+\\.\\d+(E-?\\d)??"
	    });
    }
   
}