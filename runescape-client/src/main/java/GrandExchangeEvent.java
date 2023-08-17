import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1109796019
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -3116197775568989741L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("at")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ac")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Ltm;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6870(2); // L: 118
		this.grandExchangeOffer.method6877(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "366933810"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1423774644"
	)
	static float method6869(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 200

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 201
			var3 = var3 * var2 + var0[var4]; // L: 202
		}

		return var3; // L: 204
	}
}
