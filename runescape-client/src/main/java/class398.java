import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class398 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	class394 field4494;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -374698813
	)
	int field4491;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 716250291
	)
	int field4493;

	@ObfuscatedSignature(
		descriptor = "(Lpz;II)V"
	)
	class398(class394 var1, int var2, int var3) {
		this.field4491 = 0; // L: 7
		this.field4493 = 0; // L: 8
		this.field4494 = var1; // L: 11
		this.field4491 = var2; // L: 12
		this.field4493 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	public String method7580() {
		if (this.method7584()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7583()); // L: 18

			for (int var2 = this.field4491; var2 < this.field4493; ++var2) { // L: 19
				class396 var3 = this.field4494.method7337(var2); // L: 20
				var1.append(var3.field4465); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-58"
	)
	boolean method7581(int var1) {
		return this.field4494.method7368() == 2 || this.field4494.method7368() == 1 && (!this.field4494.field4455 || this.field4493 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-931250398"
	)
	public boolean method7584() {
		return this.field4491 == this.field4493; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "345696422"
	)
	public int method7583() {
		return this.field4493 - this.field4491; // L: 35
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpc;B)Z",
		garbageValue = "-15"
	)
	boolean method7597(class396 var1) {
		if (this.field4494.field4458 == 2) { // L: 39
			return true;
		} else if (this.field4494.field4458 == 0) { // L: 40
			return false;
		} else {
			return this.field4494.method7430() != var1; // L: 41
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method7600() {
		if (this.method7584()) { // L: 46
			return 0;
		} else {
			class396 var1 = this.field4494.method7337(this.field4493 - 1); // L: 47
			if (var1.field4465 == '\n') { // L: 48
				return 0;
			} else if (this.method7597(var1)) { // L: 49
				return this.field4494.field4456.advances[42];
			} else {
				int var2 = this.field4494.field4456.advances[var1.field4465]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4465 == '\t' ? this.field4494.field4456.advances[32] * 3 : this.field4494.field4456.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lsh;",
		garbageValue = "-20"
	)
	public class485 method7585() {
		if (this.method7584()) { // L: 65
			return new class485(0, 0); // L: 66
		} else {
			class396 var1 = this.field4494.method7337(this.field4493 - 1); // L: 68
			return new class485(var1.field4464 + this.method7600(), var1.field4463); // L: 69
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lpc;",
		garbageValue = "-894884477"
	)
	public class396 method7586(int var1) {
		return var1 >= 0 && var1 < this.method7583() ? this.field4494.method7337(this.field4491 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIII)V",
		garbageValue = "1965482923"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12516
		if (var4 != null) { // L: 12517
			if (Client.minimapState < 3) { // L: 12518
				class178.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12519
			}

		}
	} // L: 12520
}
