import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1336906377
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 7037428363075878983L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ab")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("an")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lsy;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6579(2); // L: 118
		this.grandExchangeOffer.method6587(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1165951902"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-564912902"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-831918617"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class123.Widget_loadedInterfaces[var0]) { // L: 251
			return true;
		} else if (!MouseRecorder.Widget_archive.tryLoadGroup(var0)) { // L: 252
			return false;
		} else {
			int var1 = MouseRecorder.Widget_archive.getGroupFileCount(var0); // L: 253
			if (var1 == 0) { // L: 254
				class123.Widget_loadedInterfaces[var0] = true; // L: 255
				return true; // L: 256
			} else {
				if (class155.Widget_interfaceComponents[var0] == null) { // L: 258
					class155.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 259
					if (class155.Widget_interfaceComponents[var0][var2] == null) { // L: 260
						byte[] var3 = MouseRecorder.Widget_archive.takeFile(var0, var2); // L: 261
						if (var3 != null) { // L: 262
							class155.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 263
							class155.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 264
							if (var3[0] == -1) { // L: 265
								class155.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class155.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 266
							}
						}
					}
				}

				class123.Widget_loadedInterfaces[var0] = true; // L: 270
				return true; // L: 271
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1746202712"
	)
	public static int method6573(CharSequence var0) {
		return class146.method3156(var0, 10, true); // L: 68
	}
}
