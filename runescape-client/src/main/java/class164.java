import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class164 extends class142 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -4056701840650155267L
	)
	long field1774;
	@ObfuscatedName("an")
	String field1775;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class164(class145 var1) {
		this.this$0 = var1;
		this.field1774 = -1L; // L: 194
		this.field1775 = null; // L: 195
	} // L: 197

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1774 = var1.readLong(); // L: 202
		}

		this.field1775 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3210(this.field1774, this.field1775); // L: 208
	} // L: 209

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "-2001205388"
	)
	public static void method3365(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "20"
	)
	static final int method3368(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 17
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1509455427"
	)
	static void method3362(boolean var0) {
		byte var1 = 0; // L: 1232
		boolean var2 = class10.clientPreferences.method2454() >= Client.field508; // L: 1235
		if (!var2) { // L: 1237
			var1 = 12; // L: 1238
		} else if (class347.client.method1201() || class347.client.isOtlTokenRequesterInitialized() || class347.client.method1202()) { // L: 1240
			var1 = 10; // L: 1241
		}

		class390.method7249(var1); // L: 1243
		if (var0) { // L: 1244
			Login.Login_username = ""; // L: 1245
			Login.Login_password = ""; // L: 1246
			class322.field3521 = 0; // L: 1247
			SoundSystem.otp = ""; // L: 1248
		}

		Messages.method2771(); // L: 1250
		WorldMapSectionType.method5418(); // L: 1251
	} // L: 1252

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	static final void method3366(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12198
		var0 = 100 - var0; // L: 12199
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12200
		class392.method7411((double)var1); // L: 12201
	} // L: 12202
}
