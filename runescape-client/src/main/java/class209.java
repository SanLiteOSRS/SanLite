import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class209 {
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("v")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("s")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1024596909
	)
	public static int field2371;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -822786029
	)
	public static int field2372;
	@ObfuscatedName("n")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("l")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("dw")
	static boolean field2376;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "31888042"
	)
	static String method4225() {
		StringBuilder var0 = new StringBuilder(); // L: 71

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 72 78
			var2 = (Message)var1.next(); // L: 73
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 75
				var0.append(var2.sender).append(':'); // L: 76
			}
		}

		return var0.toString(); // L: 81
	}
}
