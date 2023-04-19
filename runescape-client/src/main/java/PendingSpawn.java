import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 593068225
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1586499579
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 68300005
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 800888185
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 637177597
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1665966001
	)
	int field1128;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1599541283
	)
	int field1123;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 552715177
	)
	int field1127;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 120493739
	)
	int field1126;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1966402261
	)
	int field1124;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1699404385
	)
	int field1135;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1693875037
	)
	int field1129;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -536117851
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1457211081
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1129 = 31; // L: 18
		this.delay = 0;
		this.hitpoints = -1; // L: 20
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-9"
	)
	void method2361(int var1) {
		this.field1129 = var1;
	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-633273091"
	)
	boolean method2362(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1129 & 1 << var1) != 0;
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;IZI)Lio;",
		garbageValue = "-264326412"
	)
	public static Frames method2360(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}
}
