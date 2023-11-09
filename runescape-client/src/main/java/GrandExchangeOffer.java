import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ir")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	@Export("state")
	byte state;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 50135989
	)
	@Export("id")
	public int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 679692431
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1942837321
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 151790641
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 895894785
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lrd;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-8448203"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-161610158"
	)
	void method6719(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	void method6710(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-615655692"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = Renderable.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 13144
		var0.packetBuffer.writeByte(0); // L: 13145
		Client.packetWriter.addNode(var0); // L: 13146
	} // L: 13147
}
