import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class419 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("aj")
	float field4597;
	@ObfuscatedName("al")
	float field4594;
	@ObfuscatedName("ac")
	float field4598;

	static {
		new class419(0.0F, 0.0F, 0.0F); // L: 5
		new class419(1.0F, 1.0F, 1.0F); // L: 9
		new class419(1.0F, 0.0F, 0.0F); // L: 13
		new class419(0.0F, 1.0F, 0.0F); // L: 17
		new class419(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class419(float var1, float var2, float var3) {
		this.field4597 = var1; // L: 33
		this.field4594 = var2; // L: 34
		this.field4598 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "84"
	)
	final float method7815() {
		return (float)Math.sqrt((double)(this.field4594 * this.field4594 + this.field4597 * this.field4597 + this.field4598 * this.field4598)); // L: 39
	}

	public String toString() {
		return this.field4597 + ", " + this.field4594 + ", " + this.field4598; // L: 44
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;I)I",
		garbageValue = "2060927087"
	)
	static int method7811(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 166
		String[] var3 = Login.field924; // L: 168

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 169
			var5 = var3[var4]; // L: 170
			if (var0.tryLoadFileByNames(var5, "")) { // L: 172
				++var2; // L: 173
			}
		}

		var3 = Login.field925; // L: 179

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 180
			var5 = var3[var4]; // L: 181
			if (var1.tryLoadFileByNames(var5, "")) { // L: 183
				++var2; // L: 184
			}
		}

		var3 = Login.field926; // L: 190

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 191
			var5 = var3[var4]; // L: 192
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 194
				++var2; // L: 195
			}
		}

		return var2; // L: 200
	}
}
