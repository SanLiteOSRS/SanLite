import java.io.File;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ax")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -2073836903
	)
	static int field1841;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -304944963
	)
	static int field1844;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "-1922065040"
	)
	static final void method3537(Actor var0) {
		boolean var1 = var0.field1243 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4557
		if (!var1) { // L: 4558
			SequenceDefinition var2 = class36.SequenceDefinition_get(var0.sequence); // L: 4559
			if (var2 != null && !var2.isCachedModelIdSet()) { // L: 4560
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame]; // L: 4564
			} else {
				var1 = true; // L: 4561
			}
		}

		if (var1) { // L: 4567
			int var8 = var0.field1243 - var0.spotAnimation; // L: 4568
			int var3 = Client.cycle - var0.spotAnimation; // L: 4569
			int var4 = var0.field1238 * 128 + var0.field1189 * 64; // L: 4570
			int var5 = var0.field1185 * 128 + var0.field1189 * 64; // L: 4571
			int var6 = var0.field1239 * 128 + var0.field1189 * 64; // L: 4572
			int var7 = var0.field1204 * 128 + var0.field1189 * 64; // L: 4573
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8; // L: 4574
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8; // L: 4575
		}

		var0.field1233 = 0; // L: 4577
		var0.orientation = var0.field1254; // L: 4578
		var0.rotation = var0.orientation; // L: 4579
	} // L: 4580

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1000434204"
	)
	static final void method3521(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11051
		int var7 = var3 - var1; // L: 11052
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11053
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11054
		int var10 = var8; // L: 11055
		if (var8 < var9) { // L: 11056
			var10 = var9;
		}

		if (var10 != 0) { // L: 11057
			int var11 = (var6 << 16) / var10; // L: 11058
			int var12 = (var7 << 16) / var10; // L: 11059
			if (var12 <= var11) { // L: 11060
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11061
			}

			int var13 = var5 * var12 >> 17; // L: 11062
			int var14 = var5 * var12 + 1 >> 17; // L: 11063
			int var15 = var5 * var11 >> 17; // L: 11064
			int var16 = var5 * var11 + 1 >> 17; // L: 11065
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11066
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11067
			int var17 = var0 + var13; // L: 11068
			int var18 = var0 - var14; // L: 11069
			int var19 = var0 + var6 - var14; // L: 11070
			int var20 = var0 + var6 + var13; // L: 11071
			int var21 = var15 + var1; // L: 11072
			int var22 = var1 - var16; // L: 11073
			int var23 = var7 + var1 - var16; // L: 11074
			int var24 = var7 + var15 + var1; // L: 11075
			Rasterizer3D.method4558(var17, var18, var19); // L: 11076
			Rasterizer3D.method4565(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 11077
			Rasterizer3D.method4558(var17, var19, var20); // L: 11078
			Rasterizer3D.method4565(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11079
		}
	} // L: 11080

	@ObfuscatedName("mg")
	static final void method3533(double var0) {
		Rasterizer3D.method4517(var0); // L: 12237
		((TextureProvider)Rasterizer3D.field2550.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12238
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12240
		class91.clientPreferences.method2506(var0); // L: 12242
	} // L: 12243

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-10864"
	)
	static final void method3540(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12246
		if (var0 != class91.clientPreferences.method2515()) { // L: 12247
			if (class91.clientPreferences.method2515() == 0 && ScriptFrame.method1194()) { // L: 12248
				VarcInt.method3677(CollisionMap.field2392, var0); // L: 12249
				Client.playingJingle = false; // L: 12250
			} else if (var0 == 0) { // L: 12252
				ItemComposition.method4136(0, 0); // L: 12253
				Client.playingJingle = false; // L: 12254
			} else if (!class319.field3433.isEmpty()) { // L: 12257
				Iterator var1 = class319.field3433.iterator(); // L: 12258

				while (var1.hasNext()) {
					class331 var2 = (class331)var1.next(); // L: 12259
					if (var2 != null) { // L: 12261
						var2.field3541 = var0; // L: 12264
					}
				}

				class331 var3 = (class331)class319.field3433.get(0); // L: 12267
				if (var3 != null && var3.field3538 != null && var3.field3538.isReady() && !var3.field3546) { // L: 12268
					var3.field3538.setPcmStreamVolume(var0); // L: 12269
					var3.field3542 = (float)var0; // L: 12270
				}
			}

			class91.clientPreferences.method2514(var0); // L: 12274
		}

	} // L: 12276
}
