import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class19 {
	@ObfuscatedName("vb")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("h")
	Future field112;
	@ObfuscatedName("e")
	String field109;

	class19(Future var1) {
		this.field112 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method274(var1); // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1964970587"
	)
	void method274(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field109 = var1; // L: 19
		if (this.field112 != null) { // L: 20
			this.field112.cancel(true); // L: 21
			this.field112 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "16"
	)
	public final String method275() {
		return this.field109; // L: 27
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method281() {
		return this.field109 != null || this.field112 == null; // L: 31
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public final boolean method279() {
		return this.method281() ? true : this.field112.isDone(); // L: 35 36
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Lp;",
		garbageValue = "-13054"
	)
	public final class21 method286() {
		if (this.method281()) { // L: 40
			return new class21(this.field109);
		} else if (!this.method279()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field112.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method274(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqx;IB)V",
		garbageValue = "0"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		FriendSystem.method1860(var0); // L: 73
		class300.method5841(var0); // L: 74
		if (var0.offset - var2 != var1) { // L: 75
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 76
		}
	} // L: 78
}
