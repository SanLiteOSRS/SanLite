import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 664373343
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -1846074913095996279L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("y")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("j")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lnt;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method5224(2);
		this.grandExchangeOffer.method5229(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "827394451"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "73"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[Loj;",
		garbageValue = "-77"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4239, FillMode.SOLID, FillMode.field4241};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1329889616"
	)
	static final void method5223() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		UserComparator10.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-106576024"
	)
	static void method5222(int var0, int var1) {
		int var2 = class309.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = class309.fontBold12.stringWidth(class0.method1(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > AttackOption.canvasWidth) {
			var4 = AttackOption.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > class0.canvasHeight) {
			var5 = class0.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		StructComposition.menuX = var4;
		class143.menuY = var5;
		UserComparator3.menuWidth = var2;
		PendingSpawn.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
