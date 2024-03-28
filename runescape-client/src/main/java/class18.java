import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class18 {
	@ObfuscatedName("az")
	Future field80;
	@ObfuscatedName("ah")
	String field81;

	class18(Future var1) {
		this.field80 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method261(var1); // L: 14
	} // L: 15

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2142627404"
	)
	void method261(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field81 = var1; // L: 19
		if (this.field80 != null) { // L: 20
			this.field80.cancel(true); // L: 21
			this.field80 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "559620010"
	)
	public final String method257() {
		return this.field81; // L: 27
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-741032955"
	)
	public boolean method256() {
		return this.field81 != null || this.field80 == null; // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "61"
	)
	public final boolean method258() {
		return this.method256() ? true : this.field80.isDone(); // L: 35 36
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Laa;",
		garbageValue = "644655777"
	)
	public final class20 method259() {
		if (this.method256()) { // L: 40
			return new class20(this.field81);
		} else if (!this.method258()) { // L: 41
			return null;
		} else {
			try {
				return (class20)this.field80.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method261(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}
}
