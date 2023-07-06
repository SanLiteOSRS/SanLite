import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("at")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 30823171
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1515600057
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("as")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1486866381
	)
	static int field2766;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1436309573
	)
	static int field2767;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -526063657
	)
	static int field2762;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1158638333
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ac")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field2770;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1021092525"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = World.World_worlds[var9]; // L: 185
				int var12 = Coord.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = Coord.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = World.World_worlds[var9]; // L: 207
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 208
					World.World_worlds[var7++] = var14; // L: 209
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 213
			World.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1980405644"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class347.client.method1201() && !class347.client.isOtlTokenRequesterInitialized() && !class347.client.method1202()) { // L: 1218
			Login.Login_response1 = ""; // L: 1222
			Login.Login_response2 = "Enter your username/email & password."; // L: 1223
			Login.Login_response3 = ""; // L: 1224
			class390.method7249(2); // L: 1225
			if (var0) {
				Login.Login_password = ""; // L: 1226
			}

			Messages.method2771(); // L: 1227
			WorldMapSectionType.method5418(); // L: 1228
		} else {
			class390.method7249(10); // L: 1219
		}
	} // L: 1220 1229
}
