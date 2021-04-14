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
		intValue = 115126989
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -3992330306822610567L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljn;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("p")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("b")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		signature = "(Lnu;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method4631(2);
		this.grandExchangeOffer.method4632(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "5"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "6"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("f")
	public static final void method4625(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1321413959"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
