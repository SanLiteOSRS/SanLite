import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class19 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1331663105
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("a")
	Future field105;
	@ObfuscatedName("f")
	String field103;

	class19(Future var1) {
		this.field105 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method271(var1); // L: 14
	} // L: 15

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	void method271(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field103 = var1; // L: 19
		if (this.field105 != null) { // L: 20
			this.field105.cancel(true); // L: 21
			this.field105 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-484632623"
	)
	public final String method277() {
		return this.field103; // L: 27
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	public boolean method285() {
		return this.field103 != null || this.field105 == null; // L: 31
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1019253670"
	)
	public final boolean method273() {
		return this.method285() ? true : this.field105.isDone(); // L: 35 36
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Li;",
		garbageValue = "81"
	)
	public final class21 method274() {
		if (this.method285()) { // L: 40
			return new class21(this.field103);
		} else if (!this.method273()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field105.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method271(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrx;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2; // L: 105
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-2003159676"
	)
	public static int method286(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 81
			boolean var3 = false; // L: 82
			boolean var4 = false; // L: 83
			int var5 = 0; // L: 84
			int var6 = var0.length(); // L: 85

			for (int var7 = 0; var7 < var6; ++var7) { // L: 86
				char var8 = var0.charAt(var7); // L: 87
				if (var7 == 0) { // L: 88
					if (var8 == '-') { // L: 89
						var3 = true; // L: 90
						continue;
					}

					if (var8 == '+') { // L: 93
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 95
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 96
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 97
						throw new NumberFormatException(); // L: 98
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 99
					throw new NumberFormatException();
				}

				if (var3) { // L: 100
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 101
				if (var9 / var1 != var5) { // L: 102
					throw new NumberFormatException();
				}

				var5 = var9; // L: 103
				var4 = true; // L: 104
			}

			if (!var4) { // L: 106
				throw new NumberFormatException();
			} else {
				return var5; // L: 107
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
