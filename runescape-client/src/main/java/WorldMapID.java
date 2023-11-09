import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final WorldMapID field2839;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final WorldMapID field2841;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 49151053
	)
	@Export("value")
	final int value;

	static {
		field2839 = new WorldMapID(0); // L: 4
		field2841 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "484240058"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1503364186"
	)
	static void method4981(boolean var0) {
		byte var1 = 0; // L: 1173
		if (!AbstractWorldMapIcon.method5047()) { // L: 1174
			var1 = 12; // L: 1175
		} else if (class329.client.method1112() || class329.client.isOtlTokenRequesterInitialized()) { // L: 1177
			var1 = 10; // L: 1178
		}

		UserComparator6.method2701(var1); // L: 1180
		if (var0) { // L: 1181
			Login.Login_username = ""; // L: 1182
			Login.Login_password = ""; // L: 1183
			class260.field2908 = 0; // L: 1184
			Login.otp = ""; // L: 1185
		}

		Client.method1639(); // L: 1187
		FloorOverlayDefinition.method3799(); // L: 1188
	} // L: 1189

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "966593255"
	)
	static final void method4982() {
		Client.field542 = 0; // L: 5567
		int var0 = class300.baseX * 64 + (class28.localPlayer.x >> 7); // L: 5568
		int var1 = Message.baseY * 64 + (class28.localPlayer.y >> 7); // L: 5569
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5570
			Client.field542 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5571
			Client.field542 = 1;
		}

		if (Client.field542 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5572
			Client.field542 = 0;
		}

	} // L: 5573
}
