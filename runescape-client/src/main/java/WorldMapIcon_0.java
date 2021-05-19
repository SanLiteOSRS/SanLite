import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 931727703
	)
	@Export("element")
	final int element;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -318802111
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1518104295
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lia;Lia;ILfl;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = WorldMapAreaData.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lfl;",
		garbageValue = "-7317"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1744342572"
	)
	public static boolean method3509(int var0) {
		return (var0 >> 31 & 1) != 0;
	}
}
