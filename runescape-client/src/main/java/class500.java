import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tw")
public class class500 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2034293227
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("ao")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ac")
	public final Object field5003;
	@ObfuscatedName("al")
	public final Object field5004;

	public class500(Object var1, Object var2) {
		this.field5003 = var1; // L: 8
		this.field5004 = var2; // L: 9
	} // L: 10

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field5003 != null) { // L: 38
			var1 += this.field5003.hashCode();
		}

		if (this.field5004 != null) {
			var1 += 31 * this.field5004.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public String toString() {
		return this.field5003 + ", " + this.field5004; // L: 14
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class500) { // L: 20
			class500 var2 = (class500)var1; // L: 23
			if (this.field5003 == null) { // L: 24
				if (var2.field5003 != null) { // L: 25
					return false;
				}
			} else if (!this.field5003.equals(var2.field5003)) { // L: 27
				return false;
			}

			if (this.field5004 == null) { // L: 28
				if (var2.field5004 != null) { // L: 29
					return false;
				}
			} else if (!this.field5004.equals(var2.field5004)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}
}
