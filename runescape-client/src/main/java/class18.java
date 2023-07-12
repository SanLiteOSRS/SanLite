import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class18 {
	@ObfuscatedName("wf")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("at")
	Future field89;
	@ObfuscatedName("an")
	String field91;

	class18(Future var1) {
		this.field89 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method283(var1); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-709380893"
	)
	void method283(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field91 = var1; // L: 19
		if (this.field89 != null) { // L: 20
			this.field89.cancel(true); // L: 21
			this.field89 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-9590"
	)
	public final String method274() {
		return this.field91; // L: 27
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	public boolean method280() {
		return this.field91 != null || this.field89 == null; // L: 31
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-104"
	)
	public final boolean method275() {
		return this.method280() ? true : this.field89.isDone(); // L: 35 36
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-1982612952"
	)
	public final class20 method276() {
		if (this.method280()) { // L: 40
			return new class20(this.field91);
		} else if (!this.method275()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field89.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method283(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}
}
