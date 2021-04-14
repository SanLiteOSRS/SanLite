import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class368 extends class339 implements class194 {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	AbstractArchive field4121;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgo;"
	)
	DemotingHashTable field4119;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1297473835
	)
	int field4122;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lmd;",
		garbageValue = "-883591339"
	)
	protected class341 vmethod6425(int var1) {
		synchronized(this.field4119) {
			class340 var2 = (class340)this.field4119.get((long)var1);
			if (var2 == null) {
				var2 = this.method6432(var1);
				this.field4119.method3825(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)Lmx;",
		garbageValue = "-665957162"
	)
	class340 method6432(int var1) {
		byte[] var2 = this.field4121.takeFile(this.field4122, var1);
		class340 var3 = new class340(var1);
		if (var2 != null) {
			var3.method6014(new Buffer(var2));
		}

		return var3;
	}

	public Iterator iterator() {
		return new class367(this);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIZIZI)V",
		garbageValue = "2140330129"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class9.World_worlds[var6];
			class9.World_worlds[var6] = class9.World_worlds[var1];
			class9.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = class9.World_worlds[var9];
				int var12 = WorldMapRectangle.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = WorldMapRectangle.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = class9.World_worlds[var9];
					class9.World_worlds[var9] = class9.World_worlds[var7];
					class9.World_worlds[var7++] = var14;
				}
			}

			class9.World_worlds[var1] = class9.World_worlds[var7];
			class9.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
