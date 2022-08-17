import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class152 extends class128 {
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -693046249
	)
	int field1696;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 8647621559817674409L
	)
	long field1697;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class152(class131 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1696 = var1.readInt(); // L: 310
		this.field1697 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2989(this.field1696, this.field1697); // L: 315
	} // L: 316

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "500"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class329.client.method1112() && !class329.client.isOtlTokenRequesterInitialized()) { // L: 1159
			Login.Login_response1 = ""; // L: 1163
			Login.Login_response2 = "Enter your username/email & password."; // L: 1164
			Login.Login_response3 = ""; // L: 1165
			UserComparator6.method2701(2); // L: 1166
			if (var0) { // L: 1167
				Login.Login_password = "";
			}

			Client.method1639(); // L: 1168
			FloorOverlayDefinition.method3799(); // L: 1169
		} else {
			UserComparator6.method2701(10); // L: 1160
		}
	} // L: 1161 1170

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "34881222"
	)
	static int method3152(int var0) {
		return var0 * 3 + 600; // L: 1582
	}
}
