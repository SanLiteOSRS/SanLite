import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("aw")
	@Export("state")
	byte state;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 781478777
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1239855943
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 631048929
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1844856693
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 248674297
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lty;Z)V",
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1630378592"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1876480089"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1208558885"
	)
	void method6938(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "336856274"
	)
	void method6928(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILmr;ZI)V",
		garbageValue = "1667240320"
	)
	static void method6952(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class102.getWorldMap().getMapArea(var0); // L: 5299
		int var4 = class136.localPlayer.plane; // L: 5300
		int var5 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7); // L: 5301
		int var6 = class148.baseY * 64 + (class136.localPlayer.y >> 7); // L: 5302
		Coord var7 = new Coord(var4, var5, var6); // L: 5303
		class102.getWorldMap().method8658(var3, var7, var1, var2); // L: 5304
	} // L: 5305
}
