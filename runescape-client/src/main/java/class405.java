import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class405 extends class406 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	class317 field4520;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1861839197
	)
	int field4519;

	@ObfuscatedSignature(
		descriptor = "(Lpm;IZI)V"
	)
	public class405(class406 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4520 = null; // L: 7
		this.field4519 = 0; // L: 8
		super.field4523 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class305.field3411.size()) { // L: 16
				this.field4520 = (class317)class305.field3411.get(var2); // L: 17
			} else if (!var3 && var2 < class305.field3404.size()) { // L: 19
				this.field4520 = (class317)class305.field3404.get(var2); // L: 20
			}

			this.field4519 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4520 != null && this.field4520.field3517 != null) { // L: 27
			this.field4520.field3524 = true; // L: 30

			try {
				if (this.field4520.field3510 < (float)this.field4520.field3513 && this.field4520.field3517.isReady()) { // L: 32
					float var1 = this.field4519 == 0 ? (float)this.field4519 : (float)this.field4520.field3513 / (float)this.field4519; // L: 33
					class317 var10000 = this.field4520;
					var10000.field3510 += 0.0F == var1 ? (float)this.field4520.field3513 : var1; // L: 34
					if (this.field4520.field3510 > (float)this.field4520.field3513) { // L: 35
						this.field4520.field3510 = (float)this.field4520.field3513; // L: 36
					}

					this.field4520.field3517.setPcmStreamVolume((int)this.field4520.field3510); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7601(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4520.field3524 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "0"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4579
			byte var2 = 4; // L: 4580
			int var3 = var2 + 6; // L: 4581
			int var4 = var2 + 6; // L: 4582
			int var5 = SecureRandomCallable.fontPlain12.lineWidth(var0, 250); // L: 4583
			int var6 = SecureRandomCallable.fontPlain12.lineCount(var0, 250) * 13; // L: 4584
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0); // L: 4585
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215); // L: 4586
			SecureRandomCallable.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4587
			int var7 = var3 - var2; // L: 4588
			int var8 = var4 - var2; // L: 4589
			int var9 = var2 + var5 + var2; // L: 4590
			int var10 = var2 + var6 + var2; // L: 4591

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4593
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4594
					Client.field536[var11] = true;
				}
			}

			if (var1) { // L: 4597
				AttackOption.rasterProvider.drawFull(0, 0); // L: 4598
			} else {
				DevicePcmPlayerProvider.method318(var3, var4, var5, var6); // L: 4601
			}

		}
	} // L: 4603
}
