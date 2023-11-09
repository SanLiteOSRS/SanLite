import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
class class421 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class420 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqb;)V"
	)
	class421(class420 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "-85"
	)
	int method7809(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method7809((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1455442062"
	)
	static final int method7817(int var0, int var1) {
		if (var0 == -1) { // L: 983
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 984
			if (var1 < 2) { // L: 985
				var1 = 2;
			} else if (var1 > 126) { // L: 986
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 987
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	static void method7818(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1476

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1477
			int var4 = var3 * 32 + 15 + 128; // L: 1478
			int var5 = FriendsChatMember.method7946(var4); // L: 1479
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1480
			var5 = NameableContainer.method8016(var5, var1); // L: 1481
			var2[var3] = var6 * var5 >> 16; // L: 1482
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1484
	} // L: 1485
}
