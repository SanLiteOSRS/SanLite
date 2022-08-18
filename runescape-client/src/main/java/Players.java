import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Players")
public class Players {
	@ObfuscatedName("f")
	static byte[] field1293;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	static class192[] field1294;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lqw;"
	)
	static Buffer[] field1295;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -568075581
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("z")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1632866083
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("a")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("d")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("n")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 999900845
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("g")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static Buffer field1300;

	static {
		field1293 = new byte[2048]; // L: 18
		field1294 = new class192[2048]; // L: 19
		field1295 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1300 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-2131774965"
	)
	static String method2497(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 68
			RunException var2 = (RunException)var0; // L: 69
			var1 = var2.message + " | "; // L: 70
			var0 = var2.throwable; // L: 71
		} else {
			var1 = ""; // L: 73
		}

		StringWriter var12 = new StringWriter(); // L: 74
		PrintWriter var3 = new PrintWriter(var12); // L: 75
		var0.printStackTrace(var3); // L: 76
		var3.close(); // L: 77
		String var4 = var12.toString(); // L: 78
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 79
		String var6 = var5.readLine(); // L: 80

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 82
				if (var7 == null) { // L: 83
					var1 = var1 + "| " + var6; // L: 101
					return var1; // L: 102
				}

				int var8 = var7.indexOf(40); // L: 84
				int var9 = var7.indexOf(41, var8 + 1); // L: 85
				if (var8 >= 0 && var9 >= 0) { // L: 86
					String var10 = var7.substring(var8 + 1, var9); // L: 87
					int var11 = var10.indexOf(".java:"); // L: 88
					if (var11 >= 0) { // L: 89
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 90
						var1 = var1 + var10 + ' '; // L: 91
						continue; // L: 92
					}

					var7 = var7.substring(0, var8); // L: 94
				}

				var7 = var7.trim(); // L: 96
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 97
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 98
				var1 = var1 + var7 + ' '; // L: 99
			}
		}
	}
}
