import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1049112805
	)
	static int field2287;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2039033351
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1780750535
	)
	@Export("count")
	int count;
	@ObfuscatedName("f")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("y")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-651931102"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = FontName.method6299(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2037150007"
	)
	static void method3921() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-698896598"
	)
	static final int method3920(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Occluder.method4109(var3, var5);
		int var8 = Occluder.method4109(var3 + 1, var5);
		int var9 = Occluder.method4109(var3, var5 + 1);
		int var10 = Occluder.method4109(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var13 = SoundSystem.method806(var9, var10, var4, var2);
		int var15 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var14 = ((65536 - var15) * var11 >> 16) + (var13 * var15 >> 16);
		return var14;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILii;ZI)V",
		garbageValue = "1737731022"
	)
	static void method3922(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = HealthBarUpdate.getWorldMap().getMapArea(var0);
		int var4 = class93.localPlayer.plane;
		int var5 = VertexNormal.baseX * 64 + (class93.localPlayer.x >> 7);
		int var6 = SoundSystem.baseY * 64 + (class93.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		HealthBarUpdate.getWorldMap().method6291(var3, var7, var1, var2);
	}
}
