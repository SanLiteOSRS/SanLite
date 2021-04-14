import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1471201003
	)
	@Export("element")
	final int element;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lfi;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1556775175
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 142982873
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhk;Lhk;ILfi;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = ByteArrayPool.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-52"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Lfi;",
		garbageValue = "634413820"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1975622360"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1420825097"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
