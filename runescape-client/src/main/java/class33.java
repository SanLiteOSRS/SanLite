import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class33 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1734703071
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1834111139
	)
	int field172;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 820707187
	)
	int field168;

	class33(int var1, int var2) {
		this.field172 = var1; // L: 14
		this.field168 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)Z",
		garbageValue = "1764946548"
	)
	boolean method451(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field172) { // L: 20
			case 1:
				return var1.vmethod4425(this.field168); // L: 30
			case 2:
				return var1.vmethod4442(this.field168); // L: 28
			case 3:
				return var1.vmethod4427((char)this.field168); // L: 26
			case 4:
				return var1.vmethod4467(this.field168 == 1);
			default:
				return false; // L: 22
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Loy;",
		garbageValue = "-78"
	)
	public static GameBuild method450(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.LIVE}; // L: 21
		GameBuild[] var2 = var1; // L: 23

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 24
			GameBuild var4 = var2[var3]; // L: 25
			if (var0 == var4.buildId) { // L: 27
				return var4;
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-839206131"
	)
	static final void method454(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166
}
