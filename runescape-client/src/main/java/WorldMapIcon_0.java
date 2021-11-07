import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("fa")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1687504305
	)
	@Export("element")
	final int element;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -515906735
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 724406877
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lie;Lie;ILga;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = ItemComposition.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1660589105"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lga;",
		garbageValue = "0"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374350712"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569056170"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljk;",
		garbageValue = "1771772075"
	)
	public static GameBuild method3890(int var0) {
		GameBuild[] var1 = class245.method4742();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2005741653"
	)
	static final int method3885(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
