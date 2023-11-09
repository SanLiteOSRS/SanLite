import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1765104483
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -4945736935337905557L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("x")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("m")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lqy;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6634(2); // L: 118
		this.grandExchangeOffer.method6626(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1474390937"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-101"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-180416065"
	)
	static void method6616() {
		Tiles.Tiles_minPlane = 99; // L: 49
		Tiles.field1028 = new short[4][104][104]; // L: 50
		class490.field5062 = new short[4][104][104]; // L: 51
		Tiles.field1033 = new byte[4][104][104]; // L: 52
		class358.field4344 = new byte[4][104][104]; // L: 53
		class159.field1816 = new int[4][105][105]; // L: 54
		Canvas.field136 = new byte[4][105][105]; // L: 55
		Tiles.field1030 = new int[105][105]; // L: 56
		Tiles.Tiles_hue = new int[104]; // L: 57
		PcmPlayer.Tiles_saturation = new int[104]; // L: 58
		Tiles.Tiles_lightness = new int[104]; // L: 59
		NPC.Tiles_hueMultiplier = new int[104]; // L: 60
		MenuAction.field905 = new int[104]; // L: 61
	} // L: 62
}
