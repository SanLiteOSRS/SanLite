import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Players")
public class Players {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 994098816
	)
	static int field1352;
	@ObfuscatedName("v")
	static byte[] field1353;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	static class208[] field1340;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lrd;"
	)
	static Buffer[] field1341;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1794629455
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("i")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 417558415
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("l")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("k")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("c")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("r")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -542142145
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("m")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	static Buffer field1351;

	static {
		field1353 = new byte[2048]; // L: 18
		field1340 = new class208[2048]; // L: 19
		field1341 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1351 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILoi;Llm;I)V",
		garbageValue = "-1261818676"
	)
	static void method2749(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 30
		var3.type = 1; // L: 31
		var3.key = (long)var0; // L: 32
		var3.archiveDisk = var1; // L: 33
		var3.archive = var2; // L: 34
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 35
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 36
		} // L: 37

		class288.method5590(); // L: 38
	} // L: 39

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "4"
	)
	public static int method2734(int var0) {
		return DecorativeObject.method4863(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 52
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZI)I",
		garbageValue = "1916884447"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1789() ? (var1.method1789() ? 0 : 1) : (var1.method1789() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1823() ? (var1.method1823() ? 0 : 1) : (var1.method1823() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1515481571"
	)
	static final int method2742(int var0, int var1) {
		if (var0 == -1) { // L: 1001
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1002
			if (var1 < 2) { // L: 1003
				var1 = 2;
			} else if (var1 > 126) { // L: 1004
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1005
		}
	}
}
