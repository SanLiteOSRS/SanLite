import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1063677323
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 455108447
	)
	@Export("element")
	int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1834830989
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1995278701
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ILhq;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-219905867"
	)
	@Export("init")
	void init() {
		this.element = FileSystem.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(EnumComposition.WorldMapElement_get(this.element));
		WorldMapElement var1 = EnumComposition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Liw;",
		garbageValue = "32"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-452679181"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1451719857"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lfn;",
		garbageValue = "-2084970850"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
