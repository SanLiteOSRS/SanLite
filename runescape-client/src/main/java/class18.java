import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class18 {
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -442066059
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = -1584333625
	)
	static int field86;
	@ObfuscatedName("aq")
	Future field84;
	@ObfuscatedName("aw")
	String field87;

	class18(Future var1) {
		this.field84 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method240(var1); // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "17"
	)
	void method240(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field87 = var1; // L: 19
		if (this.field84 != null) { // L: 20
			this.field84.cancel(true); // L: 21
			this.field84 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-59"
	)
	public final String method237() {
		return this.field87; // L: 27
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1166311642"
	)
	public boolean method238() {
		return this.field87 != null || this.field84 == null; // L: 31
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2031124639"
	)
	public final boolean method250() {
		return this.method238() ? true : this.field84.isDone(); // L: 35 36
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lay;",
		garbageValue = "-1043212072"
	)
	public final class20 method239() {
		if (this.method238()) { // L: 40
			return new class20(this.field87);
		} else if (!this.method250()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field84.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method240(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1100565094"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 85
		if (var3) { // L: 86
			var5 |= 65536L;
		}

		return var5; // L: 87
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-65"
	)
	static final void method252(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9242
			if (Client.showMouseOverText) { // L: 9243
				int var2 = FontName.method9113(); // L: 9244
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9246
					var3 = "Use" + " " + Client.field822 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9247
					var3 = Client.field696 + " " + Client.field574 + " " + "->";
				} else {
					var3 = SoundSystem.method810(var2); // L: 9248
				}

				if (Client.menuOptionsCount > 2) { // L: 9249
					var3 = var3 + class370.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class166.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9250
			}
		}
	} // L: 9251
}
