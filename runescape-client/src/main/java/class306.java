import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class306 implements Comparator {
	@ObfuscatedName("wr")
	static List field3402;
	@ObfuscatedName("ao")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("dw")
	static boolean field3401;

	class306() {
	} // L: 625

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;B)I",
		garbageValue = "102"
	)
	int method5814(class310 var1, class310 var2) {
		return var1.field3451 - var2.field3451; // L: 628
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 636
	}

	public int compare(Object var1, Object var2) {
		return this.method5814((class310)var1, (class310)var2); // L: 632
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "7705"
	)
	static boolean method5824() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5051
	}
}
