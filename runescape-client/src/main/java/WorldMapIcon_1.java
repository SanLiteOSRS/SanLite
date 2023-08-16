import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1715668973
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -492354983
	)
	@Export("element")
	int element;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1339483923
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 722115699
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Lmc;ILjm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("init")
	void init() {
		this.element = WorldMapElement.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class138.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class138.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135662389"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-2114244458"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-655814171"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-816534170"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "22"
	)
	public static int method5088(int var0) {
		--var0; // L: 63
		var0 |= var0 >>> 1; // L: 64
		var0 |= var0 >>> 2; // L: 65
		var0 |= var0 >>> 4; // L: 66
		var0 |= var0 >>> 8; // L: 67
		var0 |= var0 >>> 16; // L: 68
		return var0 + 1; // L: 69
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	static final void method5076() {
		PacketBufferNode var0 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 12389
		Client.packetWriter.addNode(var0); // L: 12390
		Interpreter.field887 = true; // L: 12391

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12392
			if (var1.type == 0 || var1.type == 3) { // L: 12393
				class92.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12395
			class218.invalidateWidget(Client.meslayerContinueWidget); // L: 12396
			Client.meslayerContinueWidget = null; // L: 12397
		}

		Interpreter.field887 = false; // L: 12399
	} // L: 12400
}
