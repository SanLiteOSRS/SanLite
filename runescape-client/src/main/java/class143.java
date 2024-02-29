import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class143 extends class145 {
	@ObfuscatedName("af")
	public static short[][] field1665;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -1426659775971560283L
	)
	long field1667;
	@ObfuscatedName("aw")
	String field1664;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class143(class148 var1) {
		this.this$0 = var1;
		this.field1667 = -1L; // L: 74
		this.field1664 = null; // L: 75
	} // L: 77

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1667 = var1.readLong(); // L: 82
		}

		this.field1664 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3362(this.field1667, this.field1664, 0); // L: 88
	} // L: 89

	@ObfuscatedName("aq")
	public static final void method3209(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				GrandExchangeOfferOwnWorldComparator.method1205(var0 - 1L); // L: 11
				GrandExchangeOfferOwnWorldComparator.method1205(1L); // L: 12
			} else {
				GrandExchangeOfferOwnWorldComparator.method1205(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FFFFFFFFI)V",
		garbageValue = "-2128666244"
	)
	static void method3208(class132 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1561 = var1; // L: 309
			float var9 = var4 - var1; // L: 310
			float var10 = var8 - var5; // L: 311
			float var11 = var2 - var1; // L: 312
			float var12 = 0.0F; // L: 313
			float var13 = 0.0F; // L: 314
			if ((double)var11 != 0.0D) { // L: 315
				var12 = (var6 - var5) / var11; // L: 316
			}

			var11 = var4 - var3; // L: 318
			if ((double)var11 != 0.0D) { // L: 319
				var13 = (var8 - var7) / var11; // L: 320
			}

			float var14 = 1.0F / (var9 * var9); // L: 322
			float var15 = var12 * var9; // L: 323
			float var16 = var13 * var9; // L: 324
			var0.field1563 = (var15 + var16 - var10 - var10) * var14 / var9; // L: 325
			var0.field1564 = (var10 + var10 + var10 - var15 - var15 - var16) * var14; // L: 326
			var0.field1562 = var12; // L: 327
			var0.field1566 = var5; // L: 328
		}
	} // L: 329

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static void method3203() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 301
			if (class30.clientPreferences.method2629() != null) { // L: 302
				Login.Login_username = class30.clientPreferences.method2629(); // L: 303
				Client.Login_isUsernameRemembered = true; // L: 304
			} else {
				Client.Login_isUsernameRemembered = false; // L: 306
			}

		}
	} // L: 307

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720920902"
	)
	static void method3200() {
		Varps.field3615 = null; // L: 1319
		ItemComposition.redHintArrowSprite = null; // L: 1320
		AbstractSocket.mapSceneSprites = null; // L: 1321
		class13.field61 = null; // L: 1322
		class168.field1826 = null; // L: 1323
		ChatChannel.field1041 = null; // L: 1324
		Players.field1390 = null; // L: 1325
		GrandExchangeOfferOwnWorldComparator.field492 = null; // L: 1326
		class246.field2581 = null; // L: 1327
		ClanChannelMember.scrollBarSprites = null; // L: 1328
		WorldMapCacheName.field2685 = null; // L: 1329
	} // L: 1330

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V",
		garbageValue = "104"
	)
	static void method3207(NPC var0) {
		var0.field1212 = var0.definition.size; // L: 9202
		var0.field1249 = var0.definition.rotation; // L: 9203
		var0.walkSequence = var0.definition.walkSequence; // L: 9204
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9205
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9206
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9207
		var0.idleSequence = var0.definition.idleSequence; // L: 9208
		var0.field1266 = var0.definition.turnLeftSequence; // L: 9209
		var0.field1213 = var0.definition.turnRightSequence; // L: 9210
		var0.runSequence = var0.definition.field1979; // L: 9211
		var0.field1219 = var0.definition.field1980; // L: 9212
		var0.field1220 = var0.definition.field1987; // L: 9213
		var0.field1221 = var0.definition.field1982; // L: 9214
		var0.field1222 = var0.definition.field1983; // L: 9215
		var0.field1216 = var0.definition.field1966; // L: 9216
		var0.field1224 = var0.definition.field1984; // L: 9217
		var0.field1225 = var0.definition.field1986; // L: 9218
	} // L: 9219
}
