import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class154 extends class144 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	static AbstractArchive field1710;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1865873311
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1481080051
	)
	int field1711;
	@ObfuscatedName("aj")
	String field1709;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class154(class147 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1711 = var1.readInt(); // L: 326
		this.field1709 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3348(this.field1711, this.field1709); // L: 331
	} // L: 332

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-839553538"
	)
	public static FloorOverlayDefinition method3284(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 30
			var1 = new FloorOverlayDefinition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 33
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "15000"
	)
	static void method3285(int var0, int var1) {
		int var2 = class290.fontBold12.stringWidth("Choose Option"); // L: 9263

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9264
			Font var7 = class290.fontBold12; // L: 9265
			String var8;
			if (var3 < 0) { // L: 9268
				var8 = ""; // L: 9269
			} else if (Client.menuTargets[var3].length() > 0) { // L: 9272
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 9273
			}

			int var6 = var7.stringWidth(var8); // L: 9275
			if (var6 > var2) { // L: 9276
				var2 = var6;
			}
		}

		var2 += 8; // L: 9278
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9279
		int var4 = var0 - var2 / 2; // L: 9280
		if (var4 + var2 > VarbitComposition.canvasWidth) { // L: 9281
			var4 = VarbitComposition.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9282
			var4 = 0;
		}

		int var5 = var1; // L: 9283
		if (var3 + var1 > class370.canvasHeight) { // L: 9284
			var5 = class370.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9285
			var5 = 0;
		}

		class36.menuX = var4; // L: 9286
		WorldMapElement.menuY = var5; // L: 9287
		class148.menuWidth = var2; // L: 9288
		RouteStrategy.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9289
	} // L: 9290
}
