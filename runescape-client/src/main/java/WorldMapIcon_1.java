import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 549299511
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2117222961
	)
	@Export("element")
	int element;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1186749391
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1687767569
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lia;Lia;ILfm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168451065"
	)
	@Export("init")
	void init() {
		this.element = AttackOption.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(WorldMapAreaData.WorldMapElement_get(this.element));
		WorldMapElement var1 = WorldMapAreaData.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnk;J)V"
	)
	static void method3181(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1619199647"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class93.pcmPlayer1 != null) {
			class93.pcmPlayer1.run();
		}

		if (WorldMapAreaData.pcmPlayer0 != null) {
			WorldMapAreaData.pcmPlayer0.run();
		}

	}
}
