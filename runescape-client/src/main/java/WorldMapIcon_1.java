import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1566048417
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -211441443
	)
	@Export("element")
	int element;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1002959697
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 711676767
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;ILfn;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-819350446"
	)
	@Export("init")
	void init() {
		this.element = Tiles.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(Archive.WorldMapElement_get(this.element));
		WorldMapElement var1 = Archive.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Ljava/lang/String;",
		garbageValue = "242028315"
	)
	public static String method3304(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class250.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = Actor.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjp;IIIZI)V",
		garbageValue = "-554182310"
	)
	@Export("playMusicTrack")
	public static void playMusicTrack(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class233.musicPlayerStatus = 1;
		InvDefinition.musicTrackArchive = var1;
		class233.musicTrackGroupId = var2;
		class233.musicTrackFileId = var3;
		class233.musicTrackVolume = var4;
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = var5;
		FaceNormal.pcmSampleLength = var0;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1274785577"
	)
	static void method3305(int var0) {
		class29.tempMenuAction = new MenuAction();
		class29.tempMenuAction.param0 = Client.menuArguments1[var0];
		class29.tempMenuAction.param1 = Client.menuArguments2[var0];
		class29.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class29.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class29.tempMenuAction.action = Client.menuActions[var0];
	}
}
