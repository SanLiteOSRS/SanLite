import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = -2119811283
	)
	static int field2529;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1185793619
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1255469535
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1995138313
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmh;Lmh;ILjk;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class141.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574784276"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljk;",
		garbageValue = "-49"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "472460923"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-653051141"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-4"
	)
	static final int method4849(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 957
		int var4 = var0 & var2 - 1; // L: 958
		int var5 = var1 / var2; // L: 959
		int var6 = var1 & var2 - 1; // L: 960
		int var7 = class416.method7829(var3, var5); // L: 961
		int var8 = class416.method7829(var3 + 1, var5); // L: 962
		int var9 = class416.method7829(var3, var5 + 1); // L: 963
		int var10 = class416.method7829(var3 + 1, var5 + 1); // L: 964
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 967
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 968
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 973
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 974
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 979
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 980
		return var15; // L: 982
	}
}
