import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class18 {
	@ObfuscatedName("ay")
	Future field77;
	@ObfuscatedName("an")
	String field74;

	class18(Future var1) {
		this.field77 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method265(var1); // L: 14
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "566029094"
	)
	void method265(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field74 = var1; // L: 19
		if (this.field77 != null) { // L: 20
			this.field77.cancel(true); // L: 21
			this.field77 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-24"
	)
	public final String method263() {
		return this.field74; // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	public boolean method255() {
		return this.field74 != null || this.field77 == null; // L: 31
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1327200739"
	)
	public final boolean method253() {
		return this.method255() ? true : this.field77.isDone(); // L: 35 36
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Laq;",
		garbageValue = "-999044363"
	)
	public final class20 method256() {
		if (this.method255()) { // L: 40
			return new class20(this.field74);
		} else if (!this.method253()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field77.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method265(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lmo;II)V",
		garbageValue = "1708776807"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3694 == null) { // L: 1233
			throw new RuntimeException(); // L: 1234
		} else {
			if (var0.field3754 == null) { // L: 1236
				var0.field3754 = new int[var0.field3694.length]; // L: 1237
			}

			var0.field3754[var1] = Integer.MAX_VALUE; // L: 1239
		}
	} // L: 1240

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfx;",
		garbageValue = "122"
	)
	static class137 method252(int var0) {
		class137 var2 = class142.method3102(var0); // L: 364
		int var1;
		if (var2 == null) { // L: 365
			var1 = 2; // L: 366
		} else {
			var1 = var2.method3068() ? 0 : 1; // L: 369
		}

		return var1 != 0 ? null : class142.method3102(var0); // L: 371 372 374
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "129783750"
	)
	static int method269(int var0, Script var1, boolean var2) {
		return 2; // L: 5241
	}
}
