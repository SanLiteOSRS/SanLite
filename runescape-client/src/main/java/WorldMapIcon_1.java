import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1028024263
	)
	static int field1937;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 523010301
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 626777191
	)
	@Export("element")
	int element;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 445427727
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1833440401
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lii;Lii;ILfq;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25929"
	)
	@Export("init")
	void init() {
		this.element = class23.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class6.WorldMapElement_get(this.element));
		WorldMapElement var1 = class6.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2145882550"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lfv;",
		garbageValue = "39460369"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1949510660"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-85"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lel;",
		garbageValue = "45"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class404.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Z",
		garbageValue = "2063432840"
	)
	static boolean method3232(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (class93.localPlayer == var0) {
			return MidiPcmStream.method4445();
		} else {
			boolean var1 = Client.method1514();
			if (!var1) {
				boolean var2 = (Client.drawPlayerNames & 1) != 0;
				var1 = var2 && var0.isFriend();
			}

			return var1 || class44.method451() && var0.isClanMember();
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1393020648"
	)
	static final boolean method3235() {
		return Client.isMenuOpen;
	}
}
