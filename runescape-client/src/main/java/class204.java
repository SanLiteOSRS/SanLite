import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class204 {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 326799997
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("q")
	static int[][][] field2421;

	static {
		new HashMap();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IB)Lir;",
		garbageValue = "57"
	)
	public static HealthBarDefinition method3780(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIIB)Lcy;",
		garbageValue = "-39"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class13.method129(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = ApproximateRouteStrategy.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label56: {
					byte[] var8 = ApproximateRouteStrategy.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label56;
						}

						var5 = UserComparator7.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label56;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			int var12 = (var2 + 40000 << 8) + var0;
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16));
			Script var13;
			if (var14 != null) {
				var13 = var14;
			} else {
				String var9 = String.valueOf(var12);
				int var10 = ApproximateRouteStrategy.archive12.getGroupId(var9);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = ApproximateRouteStrategy.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var14 = UserComparator7.newScript(var11);
						if (var14 != null) {
							Script.Script_cached.put(var14, (long)(var12 << 16));
							var13 = var14;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-2091339129"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
