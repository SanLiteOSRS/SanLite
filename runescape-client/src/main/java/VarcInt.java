import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("al")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1598158199"
	)
	void method3593(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3592(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IS)V",
		garbageValue = "13984"
	)
	void method3592(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true;
		}

	} // L: 43

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lgx;",
		garbageValue = "140098528"
	)
	public static HealthBarDefinition method3595(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.NpcDefinition_cachedModels.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			var1.field1918 = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2)); // L: 38
			}

			HealthBarDefinition.NpcDefinition_cachedModels.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "770454173"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 68
		if (var1 != null) { // L: 69
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 70
			var1 = new NPCComposition(); // L: 71
			var1.id = var0; // L: 72
			if (var2 != null) { // L: 73
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 74
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 75
			return var1; // L: 76
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ltf;",
		garbageValue = "1260468308"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class11.cacheDir, "preferences" + var0 + ".dat"); // L: 234
		if (var3.exists()) { // L: 235
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 237
				return var10; // L: 238
			} catch (IOException var9) { // L: 240
			}
		}

		String var4 = ""; // L: 242
		if (JagexCache.cacheGamebuild == 33) { // L: 243
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 244
			var4 = "_wip";
		}

		File var5 = new File(class334.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 245
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 246
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 248
				return var6; // L: 249
			} catch (IOException var8) { // L: 251
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 254
			return var6; // L: 255
		} catch (IOException var7) { // L: 257
			throw new RuntimeException(); // L: 258
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIILkq;[Liz;I)V",
		garbageValue = "-1433547236"
	)
	static final void method3606(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 268
		int var6 = -1; // L: 269

		while (true) {
			int var7 = var5.method9660(); // L: 271
			if (var7 == 0) { // L: 272
				return; // L: 296
			}

			var6 += var7; // L: 273
			int var8 = 0; // L: 274

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 276
				if (var9 == 0) { // L: 277
					break;
				}

				var8 += var9 - 1; // L: 278
				int var10 = var8 & 63; // L: 279
				int var11 = var8 >> 6 & 63; // L: 280
				int var12 = var8 >> 12; // L: 281
				int var13 = var5.readUnsignedByte(); // L: 282
				int var14 = var13 >> 2; // L: 283
				int var15 = var13 & 3; // L: 284
				int var16 = var11 + var1; // L: 285
				int var17 = var10 + var2; // L: 286
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 287
					int var18 = var12; // L: 288
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 289
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 290
					if (var18 >= 0) { // L: 291
						var19 = var4[var18];
					}

					ItemComposition.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 292
				}
			}
		}
	}
}
